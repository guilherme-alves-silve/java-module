#https://openjfx.io/openjfx-docs/#install-javafx
export PATH_TO_FX="/path/to/javafx-sdk-version/lib"
javac --module-source-path src/main/java --module-path $PATH_TO_FX --add-modules javafx.controls -d out/ --module packt.addressbook,packt.addressbook.ui,packt.sortutil,packt.contact,packt.sort.bubblesort,packt.sort.javasort
