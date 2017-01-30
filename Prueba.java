/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Inicio;

import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;

public class Prueba extends MIDlet implements CommandListener {
    
    private boolean midletPaused = false;
    public int resp0,res_correctas,res_incorrectas=0;
    public String val;
//<editor-fold defaultstate="collapsed" desc=" Generated Fields ">//GEN-BEGIN:|fields|0|
    private Alert alert;
    private Form Intro;
    private TextField textField;
    private Form Preg1;
    private ChoiceGroup choiceGroup;
    private Form Preg2;
    private ChoiceGroup choiceGroup1;
    private Form Preg3;
    private ChoiceGroup choiceGroup2;
    private Form Preg4;
    private TextField textField1;
    private Form Preg5;
    private ChoiceGroup choiceGroup3;
    private Form Fin;
    private StringItem stringItem;
    private Command okCommand;
    private Command okCommand1;
    private Command screenCommand;
    private Command okCommand2;
    private Command okCommand3;
    private Command okCommand4;
    private Command okCommand5;
    private Command okCommand6;
//</editor-fold>//GEN-END:|fields|0|
    /**
     * The Prueba constructor.
     */
    public Prueba() {
    }

//<editor-fold defaultstate="collapsed" desc=" Generated Methods ">//GEN-BEGIN:|methods|0|
//</editor-fold>//GEN-END:|methods|0|
//<editor-fold defaultstate="collapsed" desc=" Generated Method: initialize ">//GEN-BEGIN:|0-initialize|0|0-preInitialize
    /**
     * Initializes the application. It is called only once when the MIDlet is
     * started. The method is called before the
     * <code>startMIDlet</code> method.
     */
    private void initialize() {//GEN-END:|0-initialize|0|0-preInitialize
        // write pre-initialize user code here
//GEN-LINE:|0-initialize|1|0-postInitialize
        // write post-initialize user code here
    }//GEN-BEGIN:|0-initialize|2|
//</editor-fold>//GEN-END:|0-initialize|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: startMIDlet ">//GEN-BEGIN:|3-startMIDlet|0|3-preAction
    /**
     * Performs an action assigned to the Mobile Device - MIDlet Started point.
     */
    public void startMIDlet() {//GEN-END:|3-startMIDlet|0|3-preAction
        // write pre-action user code here
        switchDisplayable(null, getIntro());//GEN-LINE:|3-startMIDlet|1|3-postAction
        // write post-action user code here
    }//GEN-BEGIN:|3-startMIDlet|2|
//</editor-fold>//GEN-END:|3-startMIDlet|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: resumeMIDlet ">//GEN-BEGIN:|4-resumeMIDlet|0|4-preAction
    /**
     * Performs an action assigned to the Mobile Device - MIDlet Resumed point.
     */
    public void resumeMIDlet() {//GEN-END:|4-resumeMIDlet|0|4-preAction
        // write pre-action user code here
//GEN-LINE:|4-resumeMIDlet|1|4-postAction
        // write post-action user code here
    }//GEN-BEGIN:|4-resumeMIDlet|2|
//</editor-fold>//GEN-END:|4-resumeMIDlet|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: switchDisplayable ">//GEN-BEGIN:|5-switchDisplayable|0|5-preSwitch
    /**
     * Switches a current displayable in a display. The
     * <code>display</code> instance is taken from
     * <code>getDisplay</code> method. This method is used by all actions in the
     * design for switching displayable.
     *
     * @param alert the Alert which is temporarily set to the display;
     * if <code>null</code>, then <code>nextDisplayable</code> is set
     * immediately
     * @param nextDisplayable the Displayable to be set
     */
    public void switchDisplayable(Alert alert, Displayable nextDisplayable) {//GEN-END:|5-switchDisplayable|0|5-preSwitch
        // write pre-switch user code here
        Display display = getDisplay();//GEN-BEGIN:|5-switchDisplayable|1|5-postSwitch
        if (alert == null) {
            display.setCurrent(nextDisplayable);
        } else {
            display.setCurrent(alert, nextDisplayable);
        }//GEN-END:|5-switchDisplayable|1|5-postSwitch
        // write post-switch user code here
    }//GEN-BEGIN:|5-switchDisplayable|2|
//</editor-fold>//GEN-END:|5-switchDisplayable|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: commandAction for Displayables ">//GEN-BEGIN:|7-commandAction|0|7-preCommandAction
    /**
     * Called by a system to indicated that a command has been invoked on a
     * particular displayable.
     *
     * @param command the Command that was invoked
     * @param displayable the Displayable where the command was invoked
     */
    public void commandAction(Command command, Displayable displayable) {//GEN-END:|7-commandAction|0|7-preCommandAction
        // write pre-action user code here
        if (displayable == Fin) {//GEN-BEGIN:|7-commandAction|1|70-preAction
            if (command == okCommand) {//GEN-END:|7-commandAction|1|70-preAction
                // write pre-action user code here
                exitMIDlet();//GEN-LINE:|7-commandAction|2|70-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|3|16-preAction
        } else if (displayable == Intro) {
            if (command == okCommand) {//GEN-END:|7-commandAction|3|16-preAction
                // write pre-action user code here
                switchDisplayable(null, getPreg1());//GEN-LINE:|7-commandAction|4|16-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|5|29-preAction
        } else if (displayable == Preg1) {
            if (command == okCommand2) {//GEN-END:|7-commandAction|5|29-preAction
                resp0 = this.choiceGroup.getSelectedIndex();
                if(resp0 == 1){
                    res_correctas = res_correctas + 1;
                }
                switchDisplayable(null, getPreg2());//GEN-LINE:|7-commandAction|6|29-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|7|36-preAction
        } else if (displayable == Preg2) {
            if (command == okCommand3) {//GEN-END:|7-commandAction|7|36-preAction
                resp0 = this.choiceGroup1.getSelectedIndex();
                if(resp0 == 1){
                    res_correctas = res_correctas + 1;
                }
                switchDisplayable(null, getPreg3());//GEN-LINE:|7-commandAction|8|36-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|9|45-preAction
        } else if (displayable == Preg3) {
            if (command == okCommand4) {//GEN-END:|7-commandAction|9|45-preAction
                // write pre-action user code here
                switchDisplayable(null, getPreg4());//GEN-LINE:|7-commandAction|10|45-postAction
               resp0 = this.choiceGroup2.getSelectedIndex();
                if(resp0 == 1){
                    res_correctas = res_correctas + 1;
                }
            }//GEN-BEGIN:|7-commandAction|11|53-preAction
        } else if (displayable == Preg4) {
            if (command == okCommand5) {//GEN-END:|7-commandAction|11|53-preAction
                val = this.textField.getString();
                if(val.equals("C")){
                    res_correctas = res_correctas + 1;
                }
                switchDisplayable(null, getPreg5());//GEN-LINE:|7-commandAction|12|53-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|13|60-preAction
        } else if (displayable == Preg5) {
            if (command == okCommand6) {//GEN-END:|7-commandAction|13|60-preAction
                // write pre-action user code here
                switchDisplayable(getAlert(), getFin());//GEN-LINE:|7-commandAction|14|60-postAction
               resp0 = this.choiceGroup3.getSelectedIndex();
               if(resp0 == 2){
                   res_correctas = res_correctas + 1; 
               }
               res_incorrectas = 5 - res_correctas;
               this.alert.setString("Aciertos" + res_correctas + "Errores" + res_incorrectas);
            }//GEN-BEGIN:|7-commandAction|15|7-postCommandAction
        }//GEN-END:|7-commandAction|15|7-postCommandAction
        // write post-action user code here
    }//GEN-BEGIN:|7-commandAction|16|
//</editor-fold>//GEN-END:|7-commandAction|16|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: Intro ">//GEN-BEGIN:|14-getter|0|14-preInit
    /**
     * Returns an initialized instance of Intro component.
     *
     * @return the initialized component instance
     */
    public Form getIntro() {
        if (Intro == null) {//GEN-END:|14-getter|0|14-preInit
            // write pre-init user code here
            Intro = new Form("form", new Item[]{getTextField()});//GEN-BEGIN:|14-getter|1|14-postInit
            Intro.addCommand(getOkCommand());
            Intro.setCommandListener(this);//GEN-END:|14-getter|1|14-postInit
            // write post-init user code here
        }//GEN-BEGIN:|14-getter|2|
        return Intro;
    }
//</editor-fold>//GEN-END:|14-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField ">//GEN-BEGIN:|17-getter|0|17-preInit
    /**
     * Returns an initialized instance of textField component.
     *
     * @return the initialized component instance
     */
    public TextField getTextField() {
        if (textField == null) {//GEN-END:|17-getter|0|17-preInit
            // write pre-init user code here
            textField = new TextField("Bienvenido...", "TEST  SOBRE REDES", 32, TextField.ANY);//GEN-LINE:|17-getter|1|17-postInit
            // write post-init user code here
        }//GEN-BEGIN:|17-getter|2|
        return textField;
    }
//</editor-fold>//GEN-END:|17-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand ">//GEN-BEGIN:|15-getter|0|15-preInit
    /**
     * Returns an initialized instance of okCommand component.
     *
     * @return the initialized component instance
     */
    public Command getOkCommand() {
        if (okCommand == null) {//GEN-END:|15-getter|0|15-preInit
            // write pre-init user code here
            okCommand = new Command("Ok", Command.OK, 0);//GEN-LINE:|15-getter|1|15-postInit
            // write post-init user code here
        }//GEN-BEGIN:|15-getter|2|
        return okCommand;
    }
//</editor-fold>//GEN-END:|15-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand1 ">//GEN-BEGIN:|20-getter|0|20-preInit
    /**
     * Returns an initialized instance of okCommand1 component.
     *
     * @return the initialized component instance
     */
    public Command getOkCommand1() {
        if (okCommand1 == null) {//GEN-END:|20-getter|0|20-preInit
            // write pre-init user code here
            okCommand1 = new Command("Ok", Command.OK, 0);//GEN-LINE:|20-getter|1|20-postInit
            // write post-init user code here
        }//GEN-BEGIN:|20-getter|2|
        return okCommand1;
    }
//</editor-fold>//GEN-END:|20-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: screenCommand ">//GEN-BEGIN:|25-getter|0|25-preInit
    /**
     * Returns an initialized instance of screenCommand component.
     *
     * @return the initialized component instance
     */
    public Command getScreenCommand() {
        if (screenCommand == null) {//GEN-END:|25-getter|0|25-preInit
            // write pre-init user code here
            screenCommand = new Command("Screen", Command.SCREEN, 0);//GEN-LINE:|25-getter|1|25-postInit
            // write post-init user code here
        }//GEN-BEGIN:|25-getter|2|
        return screenCommand;
    }
//</editor-fold>//GEN-END:|25-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: Preg1 ">//GEN-BEGIN:|27-getter|0|27-preInit
    /**
     * Returns an initialized instance of Preg1 component.
     *
     * @return the initialized component instance
     */
    public Form getPreg1() {
        if (Preg1 == null) {//GEN-END:|27-getter|0|27-preInit
            // write pre-init user code here
            Preg1 = new Form("form", new Item[]{getChoiceGroup()});//GEN-BEGIN:|27-getter|1|27-postInit
            Preg1.addCommand(getOkCommand2());
            Preg1.setCommandListener(this);//GEN-END:|27-getter|1|27-postInit
            // write post-init user code here
        }//GEN-BEGIN:|27-getter|2|
        return Preg1;
    }
//</editor-fold>//GEN-END:|27-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: choiceGroup ">//GEN-BEGIN:|31-getter|0|31-preInit
    /**
     * Returns an initialized instance of choiceGroup component.
     *
     * @return the initialized component instance
     */
    public ChoiceGroup getChoiceGroup() {
        if (choiceGroup == null) {//GEN-END:|31-getter|0|31-preInit
            // write pre-init user code here
            choiceGroup = new ChoiceGroup("Una red es el conjunto de equipos y dispositivos  conectados entre si  para interactuar y compartir recursos?", Choice.EXCLUSIVE);//GEN-BEGIN:|31-getter|1|31-postInit
            choiceGroup.append("FALSO", null);
            choiceGroup.append("VERDADERO", null);
            choiceGroup.setSelectedFlags(new boolean[]{false, false});//GEN-END:|31-getter|1|31-postInit
            // write post-init user code here
        }//GEN-BEGIN:|31-getter|2|
        return choiceGroup;
    }
//</editor-fold>//GEN-END:|31-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand2 ">//GEN-BEGIN:|28-getter|0|28-preInit
    /**
     * Returns an initialized instance of okCommand2 component.
     *
     * @return the initialized component instance
     */
    public Command getOkCommand2() {
        if (okCommand2 == null) {//GEN-END:|28-getter|0|28-preInit
            // write pre-init user code here
            okCommand2 = new Command("Ok", Command.OK, 0);//GEN-LINE:|28-getter|1|28-postInit
            // write post-init user code here
        }//GEN-BEGIN:|28-getter|2|
        return okCommand2;
    }
//</editor-fold>//GEN-END:|28-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: Preg2 ">//GEN-BEGIN:|34-getter|0|34-preInit
    /**
     * Returns an initialized instance of Preg2 component.
     *
     * @return the initialized component instance
     */
    public Form getPreg2() {
        if (Preg2 == null) {//GEN-END:|34-getter|0|34-preInit
            // write pre-init user code here
            Preg2 = new Form("form", new Item[]{getChoiceGroup1()});//GEN-BEGIN:|34-getter|1|34-postInit
            Preg2.addCommand(getOkCommand3());
            Preg2.setCommandListener(this);//GEN-END:|34-getter|1|34-postInit
            // write post-init user code here
        }//GEN-BEGIN:|34-getter|2|
        return Preg2;
    }
//</editor-fold>//GEN-END:|34-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand3 ">//GEN-BEGIN:|35-getter|0|35-preInit
    /**
     * Returns an initialized instance of okCommand3 component.
     *
     * @return the initialized component instance
     */
    public Command getOkCommand3() {
        if (okCommand3 == null) {//GEN-END:|35-getter|0|35-preInit
            // write pre-init user code here
            okCommand3 = new Command("Ok", Command.OK, 0);//GEN-LINE:|35-getter|1|35-postInit
            // write post-init user code here
        }//GEN-BEGIN:|35-getter|2|
        return okCommand3;
    }
//</editor-fold>//GEN-END:|35-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: choiceGroup1 ">//GEN-BEGIN:|38-getter|0|38-preInit
    /**
     * Returns an initialized instance of choiceGroup1 component.
     *
     * @return the initialized component instance
     */
    public ChoiceGroup getChoiceGroup1() {
        if (choiceGroup1 == null) {//GEN-END:|38-getter|0|38-preInit
            // write pre-init user code here
            choiceGroup1 = new ChoiceGroup("Redes que abarcan conexiones locales como una institucion, oficina, casa, etc.", Choice.EXCLUSIVE);//GEN-BEGIN:|38-getter|1|38-postInit
            choiceGroup1.append("MAN", null);
            choiceGroup1.append("LAN", null);
            choiceGroup1.append("WLAN", null);
            choiceGroup1.setSelectedFlags(new boolean[]{false, false, false});//GEN-END:|38-getter|1|38-postInit
            // write post-init user code here
        }//GEN-BEGIN:|38-getter|2|
        return choiceGroup1;
    }
//</editor-fold>//GEN-END:|38-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: Preg3 ">//GEN-BEGIN:|43-getter|0|43-preInit
    /**
     * Returns an initialized instance of Preg3 component.
     *
     * @return the initialized component instance
     */
    public Form getPreg3() {
        if (Preg3 == null) {//GEN-END:|43-getter|0|43-preInit
            // write pre-init user code here
            Preg3 = new Form("form", new Item[]{getChoiceGroup2()});//GEN-BEGIN:|43-getter|1|43-postInit
            Preg3.addCommand(getOkCommand4());
            Preg3.setCommandListener(this);//GEN-END:|43-getter|1|43-postInit
            // write post-init user code here
        }//GEN-BEGIN:|43-getter|2|
        return Preg3;
    }
//</editor-fold>//GEN-END:|43-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: choiceGroup2 ">//GEN-BEGIN:|46-getter|0|46-preInit
    /**
     * Returns an initialized instance of choiceGroup2 component.
     *
     * @return the initialized component instance
     */
    public ChoiceGroup getChoiceGroup2() {
        if (choiceGroup2 == null) {//GEN-END:|46-getter|0|46-preInit
            // write pre-init user code here
            choiceGroup2 = new ChoiceGroup("Seleccione la opcion que corresponda a un medio de transmision no guiado:", Choice.POPUP);//GEN-BEGIN:|46-getter|1|46-postInit
            choiceGroup2.append("PAR TRENZADO", null);
            choiceGroup2.append("ANTENAS", null);
            choiceGroup2.append("FIBRA OPTICA", null);
            choiceGroup2.setSelectedFlags(new boolean[]{false, false, false});//GEN-END:|46-getter|1|46-postInit
            // write post-init user code here
        }//GEN-BEGIN:|46-getter|2|
        return choiceGroup2;
    }
//</editor-fold>//GEN-END:|46-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: Preg4 ">//GEN-BEGIN:|51-getter|0|51-preInit
    /**
     * Returns an initialized instance of Preg4 component.
     *
     * @return the initialized component instance
     */
    public Form getPreg4() {
        if (Preg4 == null) {//GEN-END:|51-getter|0|51-preInit
            // write pre-init user code here
            Preg4 = new Form("form", new Item[]{getTextField1()});//GEN-BEGIN:|51-getter|1|51-postInit
            Preg4.addCommand(getOkCommand5());
            Preg4.setCommandListener(this);//GEN-END:|51-getter|1|51-postInit
            // write post-init user code here
        }//GEN-BEGIN:|51-getter|2|
        return Preg4;
    }
//</editor-fold>//GEN-END:|51-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField1 ">//GEN-BEGIN:|57-getter|0|57-preInit
    /**
     * Returns an initialized instance of textField1 component.
     *
     * @return the initialized component instance
     */
    public TextField getTextField1() {
        if (textField1 == null) {//GEN-END:|57-getter|0|57-preInit
            // write pre-init user code here
            textField1 = new TextField("Escriba la clase a la que pertenece la siguiente direccion 192.168.1.12", "", 32, TextField.ANY);//GEN-LINE:|57-getter|1|57-postInit
            // write post-init user code here
        }//GEN-BEGIN:|57-getter|2|
        return textField1;
    }
//</editor-fold>//GEN-END:|57-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand4 ">//GEN-BEGIN:|44-getter|0|44-preInit
    /**
     * Returns an initialized instance of okCommand4 component.
     *
     * @return the initialized component instance
     */
    public Command getOkCommand4() {
        if (okCommand4 == null) {//GEN-END:|44-getter|0|44-preInit
            // write pre-init user code here
            okCommand4 = new Command("Ok", Command.OK, 0);//GEN-LINE:|44-getter|1|44-postInit
            // write post-init user code here
        }//GEN-BEGIN:|44-getter|2|
        return okCommand4;
    }
//</editor-fold>//GEN-END:|44-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand5 ">//GEN-BEGIN:|52-getter|0|52-preInit
    /**
     * Returns an initialized instance of okCommand5 component.
     *
     * @return the initialized component instance
     */
    public Command getOkCommand5() {
        if (okCommand5 == null) {//GEN-END:|52-getter|0|52-preInit
            // write pre-init user code here
            okCommand5 = new Command("Ok", Command.OK, 0);//GEN-LINE:|52-getter|1|52-postInit
            // write post-init user code here
        }//GEN-BEGIN:|52-getter|2|
        return okCommand5;
    }
//</editor-fold>//GEN-END:|52-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: Preg5 ">//GEN-BEGIN:|58-getter|0|58-preInit
    /**
     * Returns an initialized instance of Preg5 component.
     *
     * @return the initialized component instance
     */
    public Form getPreg5() {
        if (Preg5 == null) {//GEN-END:|58-getter|0|58-preInit
            // write pre-init user code here
            Preg5 = new Form("form", new Item[]{getChoiceGroup3()});//GEN-BEGIN:|58-getter|1|58-postInit
            Preg5.addCommand(getOkCommand6());
            Preg5.setCommandListener(this);//GEN-END:|58-getter|1|58-postInit
            // write post-init user code here
        }//GEN-BEGIN:|58-getter|2|
        return Preg5;
    }
//</editor-fold>//GEN-END:|58-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: choiceGroup3 ">//GEN-BEGIN:|62-getter|0|62-preInit
    /**
     * Returns an initialized instance of choiceGroup3 component.
     *
     * @return the initialized component instance
     */
    public ChoiceGroup getChoiceGroup3() {
        if (choiceGroup3 == null) {//GEN-END:|62-getter|0|62-preInit
            // write pre-init user code here
            choiceGroup3 = new ChoiceGroup("Cual es el codigo de colores utilizado en un cable de res?", Choice.MULTIPLE);//GEN-BEGIN:|62-getter|1|62-postInit
            choiceGroup3.append("B/N,A,B/C,N,B/A,V,B/V,C", null);
            choiceGroup3.append("C,B/C,V,A,B/V,B/N,N,B/A", null);
            choiceGroup3.append("B/N,N,B/V,A,B/A,V,B/C,C", null);
            choiceGroup3.setSelectedFlags(new boolean[]{false, false, false});//GEN-END:|62-getter|1|62-postInit
            // write post-init user code here
        }//GEN-BEGIN:|62-getter|2|
        return choiceGroup3;
    }
//</editor-fold>//GEN-END:|62-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand6 ">//GEN-BEGIN:|59-getter|0|59-preInit
    /**
     * Returns an initialized instance of okCommand6 component.
     *
     * @return the initialized component instance
     */
    public Command getOkCommand6() {
        if (okCommand6 == null) {//GEN-END:|59-getter|0|59-preInit
            // write pre-init user code here
            okCommand6 = new Command("Ok", Command.OK, 0);//GEN-LINE:|59-getter|1|59-postInit
            // write post-init user code here
        }//GEN-BEGIN:|59-getter|2|
        return okCommand6;
    }
//</editor-fold>//GEN-END:|59-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: alert ">//GEN-BEGIN:|66-getter|0|66-preInit
    /**
     * Returns an initialized instance of alert component.
     *
     * @return the initialized component instance
     */
    public Alert getAlert() {
        if (alert == null) {//GEN-END:|66-getter|0|66-preInit
            // write pre-init user code here
            alert = new Alert("alert", "<null>", null, AlertType.ALARM);//GEN-BEGIN:|66-getter|1|66-postInit
            alert.setTimeout(Alert.FOREVER);//GEN-END:|66-getter|1|66-postInit
            // write post-init user code here
        }//GEN-BEGIN:|66-getter|2|
        return alert;
    }
//</editor-fold>//GEN-END:|66-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: Fin ">//GEN-BEGIN:|69-getter|0|69-preInit
    /**
     * Returns an initialized instance of Fin component.
     *
     * @return the initialized component instance
     */
    public Form getFin() {
        if (Fin == null) {//GEN-END:|69-getter|0|69-preInit
            // write pre-init user code here
            Fin = new Form("form", new Item[]{getStringItem()});//GEN-BEGIN:|69-getter|1|69-postInit
            Fin.addCommand(getOkCommand());
            Fin.setCommandListener(this);//GEN-END:|69-getter|1|69-postInit
            // write post-init user code here
        }//GEN-BEGIN:|69-getter|2|
        return Fin;
    }
//</editor-fold>//GEN-END:|69-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: stringItem ">//GEN-BEGIN:|75-getter|0|75-preInit
    /**
     * Returns an initialized instance of stringItem component.
     *
     * @return the initialized component instance
     */
    public StringItem getStringItem() {
        if (stringItem == null) {//GEN-END:|75-getter|0|75-preInit
            // write pre-init user code here
            stringItem = new StringItem("Evaluacion ha terminado ", "");//GEN-LINE:|75-getter|1|75-postInit
            // write post-init user code here
        }//GEN-BEGIN:|75-getter|2|
        return stringItem;
    }
//</editor-fold>//GEN-END:|75-getter|2|

    /**
     * Returns a display instance.
     *
     * @return the display instance.
     */
    public Display getDisplay() {
        return Display.getDisplay(this);
    }

    /**
     * Exits MIDlet.
     */
    public void exitMIDlet() {
        switchDisplayable(null, null);
        destroyApp(true);
        notifyDestroyed();
    }

    /**
     * Called when MIDlet is started. Checks whether the MIDlet have been
     * already started and initialize/starts or resumes the MIDlet.
     */
    public void startApp() {
        if (midletPaused) {
            resumeMIDlet();
        } else {
            initialize();
            startMIDlet();
        }
        midletPaused = false;
    }

    /**
     * Called when MIDlet is paused.
     */
    public void pauseApp() {
        midletPaused = true;
    }

    /**
     * Called to signal the MIDlet to terminate.
     *
     * @param unconditional if true, then the MIDlet has to be unconditionally
     * terminated and all resources has to be released.
     */
    public void destroyApp(boolean unconditional) {
    }
}
