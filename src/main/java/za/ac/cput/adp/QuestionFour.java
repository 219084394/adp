package za.ac.cput.adp;

/*
 *@Author Anicka Schouw 217284183
 * Assignment 1 2021
 */


public class QuestionFour {
//Anicka Schouw 217284183
     private String equal,identify,fail, timeout,disable;

    public String getEqual() {
        return equal;
    }

    public void setEqual(String equal) {
        this.equal = equal;
    }

    public String getIdentify() {
        return identify;
    }

    public void setIdentify(String identify) {
        this.identify = identify;
    }

    public String getFail() {
        return fail;
    }

    public void setFail(String fail) {
        this.fail = fail;
    }

    public String getTimeout() {
        return timeout;
    }

    public void setTimeout(String timeout) {
        this.timeout = timeout;
    }

    public String getDisable() {
        return disable;
    }

    public void setDisable(String disable) {
        this.disable = disable;
    }

    @Override
    public String toString() {
        return "QuestionFour{" +
                "equal='" + equal + '\'' +
                ", identify='" + identify + '\'' +
                ", fail='" + fail + '\'' +
                ", timeout='" + timeout + '\'' +
                ", disable='" + disable + '\'' +
                '}';
    }
}
