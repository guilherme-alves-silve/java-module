# The folder javafx-jmods-11.0.2 was downloaded from the page https://gluonhq.com/products/javafx/
export PATH_TO_FX=../javafx-jmods-11.0.2
javac --module-source-path src/main/java --module-path $PATH_TO_FX --add-modules javafx.controls -d out --module packt.addressbook,packt.addressbook.ui,packt.sortutil,packt.contact
