// IRemoteServiceCallback.aidl
package pl.futuredev.servistest2;

// Declare any non-default types here with import statements

oneway interface IRemoteServiceCallback {

    void valueChanged(int value);

}
