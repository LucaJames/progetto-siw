package it.uniroma3.converter;

import it.uniroma3.clinic.Paziente;
import it.uniroma3.facade.PazienteFacade;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;



@ManagedBean
public class PazienteConverter implements Converter{
	
    @EJB
    private PazienteFacade pazienteFacade;

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String submittedValue) {
        Paziente paziente = pazienteFacade.getPaziente(Long.valueOf(submittedValue));
        return paziente;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object modelValue) {
        if (modelValue == null) {
            return "";
        }

        if (modelValue instanceof Paziente) {
            return String.valueOf(((Paziente) modelValue).getUsername());
        } else {
            throw new ConverterException(new FacesMessage(String.format("%s is not a valid Paziente", modelValue)));
        }
    }

}