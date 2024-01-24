package sorcer.arithmetic.provider;

import sorcer.service.Context;
import sorcer.service.ContextException;
import sorcer.service.MonitorException;
import java.rmi.RemoteException;

@FunctionalInterface
public interface AssetStore {
    public Context buyAsset(Context context) throws RemoteException, ContextException, MonitorException;
}