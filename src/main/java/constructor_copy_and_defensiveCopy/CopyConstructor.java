package constructor_copy_and_defensiveCopy;

import java.util.Date;

public class CopyConstructor {

    private String name;
    private Date joiningDate;

    // Default Construcotr
    public CopyConstructor(String name) {
        this.name = name;
        // Defensive Copy
        this.joiningDate = new Date(joiningDate.getTime());
    }

    // Copy Constructor
    private CopyConstructor(CopyConstructor other){
        this.name = other.name;
        this.joiningDate = new Date(other.joiningDate.getTime());
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getJoiningDate() {
        return new Date(joiningDate.getTime());
    }

    public void setJoiningDate(Date joiningDate) {
        this.joiningDate = new Date(joiningDate.getTime());
    }



}


