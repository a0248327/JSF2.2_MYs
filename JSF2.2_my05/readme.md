
Konvertierung

	<h:outputLabel for="firstName" value="First Name:" />
	<h:inputText id="firstName" size="30" maxlength="40" required="true" value="#{customerBean.customer.firstName}" >
		<f:converter converterId="at.irian.ReplaceConverter" />
	</h:inputText>
	
	<h:outputLabel for="zipCode" value="#{msgs.zip_code}:" />
	<h:inputText id="zipCode" size="30" value="#{customerBean.customer.zipCode}">
		<f:converter converterId="at.irian.ZipCode" />
	</h:inputText>
