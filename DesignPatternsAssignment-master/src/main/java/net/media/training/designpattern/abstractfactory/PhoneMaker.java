package net.media.training.designpattern.abstractfactory;


/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 6:34:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class PhoneMaker {

    public Case buildPhone(String phoneType) {
        PhoneFactory phoneFactory;
        if (phoneType.equals("Android")) {
            phoneFactory = new AndroidFactory();
        } else {
            phoneFactory = new IPhoneFactory();
        }

        MotherBoard motherBoard = phoneFactory.createMotherBoard();
        motherBoard.attachBattery(phoneFactory.createBattery());
        motherBoard.attachProcessor(phoneFactory.createProcessor());

        Screen screen = phoneFactory.createScreen();
        Case phoneCase = phoneFactory.createCase();
        phoneCase.attachMotherBoard(motherBoard);
        phoneCase.attachScreen(screen);

        return phoneCase;
    }
}
