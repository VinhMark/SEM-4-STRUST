package validate;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

import org.hibernate.metamodel.ValidationException;
//định nghĩa hàm lỗi của riêng mình 
@FacesValidator(value="usernameValidate")
public class UsernameValidate implements Validator {

	@Override
	public void validate(FacesContext facesContext, UIComponent uiComponentt, Object object) throws ValidatorException {
		String username = object.toString();
		if (username.equalsIgnoreCase("abc")) {
			FacesMessage facesMessage = new FacesMessage();
			facesMessage.setDetail("Username is exits");
			facesMessage.setSeverity(facesMessage.SEVERITY_ERROR);//kiểu lỗi 
			throw new ValidatorException(facesMessage);
		} 
	}

}
