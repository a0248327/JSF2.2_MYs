

1. Java Soruce Code
  1. domain:      相当于Bean
  2. jsf:         Convertierung
  3. component:   定义自己的Component
  4. page:        设置网页链接
  5. util:        
  6. service:     提供数据
  7. validation:  BirthdayValidator

2. messages
  1. messages_de.properties
  2. messages_en.properties

3. src
  1. log4j.properties
  2. ValidationMessages_de.properties
  3. ValidationMessages_en.properties

4. WebContent
  1. *.xhtml
    1. editAddress.xhtml:   
      1. convertZipCode
      2. h:commandButton id="cancel" value="#{msgs.cancel}" action="/showCustomer.xhtml" immediate="true"
    2. editCustomer.xhtml:  
      1. f:convertDateTime pattern="dd.MM.yyyy"
      2. mg:validateAge minAge="18"
      3. onclick="this.form.submit()"
      4. valueChangeListener="#{customerBean.useCreditCardChanged}"
      5. rendered="#{customerBean.customer.useCreditCard}"
      6. validator="#{customerBean.validateCreditNumber}"
    3. editProvider.xhtml
      1. h:commandButton id="cancel" value="#{msgs.cancel}" immediate="true"action="showProvider?faces-redirect=true&amp;includeViewParams=true"
    4. index.xhtml
      1. URL=showCustomer.jsf"
    5. providerList.xhtml
    6. showCustomer.xhtml
    7. showProvider.xhtml
  2. META-INF
    1. template
      1. template.xhtml 定义 template
      2. customerTemplate.xhtml 指向 leftSideBar.xhtml 并调用了 template.xhtml
      3. lefSideBar.xhtml
  3. resources:
    1. images
    2. styles: css
  4. WEB-INF: faces-config.xml, mygourmet.taglib.xml, web.xml
