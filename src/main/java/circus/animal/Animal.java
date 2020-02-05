package circus.animal;

import circus.Asset;

public abstract class Animal implements Asset {

    //implementation of a speak method is done by the child classes
    public abstract String speak();
}
