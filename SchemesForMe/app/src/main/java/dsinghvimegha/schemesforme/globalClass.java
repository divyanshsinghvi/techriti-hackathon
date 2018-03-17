package dsinghvimegha.schemesforme;

import android.app.Application;

/**
 * Created by dsinghvi on 17/3/18.
 */

public class globalClass extends Application {
    int income;
    int category;
    int gender;
    int loan;
    public void setIncome(int income)
    {
        this.income = income;
    }
    public void setCategory(int category)
    {
        this.category = category;
    }
    public void setGender(int gender)
    {
        this.gender = gender;
    }
    public void setLoan(int loan)
    {
        this.loan = loan;
    }

}
