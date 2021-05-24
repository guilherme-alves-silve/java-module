# The folder javafx-jmods-11.0.2 was downloaded from the page https://gluonhq.com/products/javafx/
export PATH_TO_FX_MODS=../javafx-jmods-11.0.2
java --module-path out,$PATH_TO_FX_MODS --add-modules javafx.controls --module packt.addressbook.ui/packt.addressbook.ui.Main
