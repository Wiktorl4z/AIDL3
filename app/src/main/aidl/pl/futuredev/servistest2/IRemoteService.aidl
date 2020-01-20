// IRemoteService.aidl
package pl.futuredev.servistest2;

// Declare any non-default types here with import statements

interface IRemoteService {
     /**
       * Often you want to allow a service to call back to its clients.
       * This shows how to do so, by registering a callback interface with
       * the service.
       */
   //   void registerCallback(IRemoteServiceCallback cb);

      /**
       * Remove a previously registered callback interface.
       */
   //   void unregisterCallback(IRemoteServiceCallback cb);


       /** Request the process ID of this service, to do evil things with it. */
       int getPid();

       /** Demonstrates some basic types that you can use as parameters
        * and return values in AIDL.
        */
       void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat,
               double aDouble, String aString);

  }