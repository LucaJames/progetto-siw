package it.uniroma3.converter;



import it.uniroma3.clinic.TipologiaEsame;
import it.uniroma3.facade.TipologiaEsameFacade;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;



@ManagedBean
@RequestScoped
public class TipologiaEsameConverter implements Converter {

    @EJB
    private TipologiaEsameFacade tipologiaEsameFacade;

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String submittedValue) {
        if (submittedValue == null || submittedValue.isEmpty()) {
            return null;
        }

        try {
            return tipologiaEsameFacade.getTipologiaEsame(Long.valueOf(submittedValue));
        } catch (NumberFormatException e) {
            throw new ConverterException(new FacesMessage(String.format("%s is not a valid User ID", submittedValue)), e);
        }
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object modelValue) {
        if (modelValue == null) {
            return "";
        }

        if (modelValue instanceof TipologiaEsame) {
            return String.valueOf(((TipologiaEsame) modelValue).getId());
        } else {
            throw new ConverterException(new FacesMessage(String.format("%s is not a valid TipologiaEsame", modelValue)));
        }
    }

}