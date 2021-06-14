@REM https://openjfx.io/openjfx-docs/#install-javafx
@REM set PATH_TO_FX="C:\path\to\javafx-sdk-version\lib"
@REM set PATH_TO_FX_MODS="C:\path\to\javafx-sdk-version\jmods"
set PATH_TO_FX="D:\javafx-sdk-11.0.2\lib"
set PATH_TO_FX_MODS="D:\javafx-sdk-11.0.2\jmods"
javac --module-source-path src\main\java\ --module-path %PATH_TO_FX% --add-modules javafx.controls -d out/ --module packt.addressbook,packt.addressbook.ui,packt.sortutil,packt.contact,packt.sort.bubblesort,packt.sort.javasort
%JAVA_HOME%/bin/jlink --module-path out/;%PATH_TO_FX_MODS% --add-modules packt.addressbook.ui --bind-services --compress=2 --include-locales=en --output image-compress-locale-2
cmd /c echo F | xcopy input.xml image-compress-locale-2\
