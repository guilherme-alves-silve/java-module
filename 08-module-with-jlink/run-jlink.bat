@REM #https://openjfx.io/openjfx-docs/#install-javafx
@REM set PATH_TO_FX="C:\path\to\javafx-sdk-version\lib"
set PATH_TO_FX="D:\javafx-sdk-11.0.2\lib"
jlink --module-path %PATH_TO_FX%;out --add-modules javafx.controls --module packt.addressbook.ui/packt.addressbook.ui.Main
