package model;

import securityInterface.IRequestPinCode;

public class PinCodeCheck extends SecurityCheck
{
    private IRequestPinCode reqPinCode;

    public PinCodeCheck(IRequestPinCode reqPinCode)
    {
        this.reqPinCode = reqPinCode;
    }

    private boolean IsValid(int pin)
    {
        return true;
    }

    @Override
    public boolean ValidateUser()
    {
        int code = reqPinCode.RequestPinCode();
        if (IsValid(code))
        {
            return true;
        }

        return false;
    }
}
