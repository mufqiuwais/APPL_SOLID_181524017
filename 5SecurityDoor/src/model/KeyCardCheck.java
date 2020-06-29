package model;

import securityInterface.IRequestKeyCard;

public class KeyCardCheck extends SecurityCheck
{
    private IRequestKeyCard reqKeyCard;

    public KeyCardCheck(IRequestKeyCard reqKeyCard)
    {
        this.reqKeyCard = reqKeyCard;
    }

    private boolean IsValid(String code)
    {
        return true;
    }

    @Override
    public boolean ValidateUser()
    {
        String code = reqKeyCard.RequestKeyCard();
        if (IsValid(code))
        {
            return true;
        }

        return false;
    }
}