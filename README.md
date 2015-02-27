

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
  2. META-INF
    1. template
      1. template.xhtml 定义 template
      2. customerTemplate.xhtml 指向 leftSideBar.xhtml 并调用了 template.xhtml
      3. lefSideBar.xhtml
  3. resources:
    1. images
    2. styles: css
  4. WEB-INF: faces-config.xml, mygourmet.taglib.xml, web.xml
