package station;

import workerInterface.IRechargeable;

public class RechargeStation
{
    public void Recharge(IRechargeable rechargeable)
    {
        rechargeable.Recharge();
    }
}
