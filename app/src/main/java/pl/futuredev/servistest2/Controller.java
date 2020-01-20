package pl.futuredev.servistest2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Controller extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.remote_service_controller);

        // Watch for button clicks.
        Button button = findViewById(R.id.start);
        button.setOnClickListener(mStartListener);
        button = findViewById(R.id.stop);
        button.setOnClickListener(mStopListener);
    }

    private View.OnClickListener mStartListener = v -> {
        // Make sure the service is started.  It will continue running
        // until someone calls stopService().
        // We use an action code here, instead of explictly supplying
        // the component name, so that other packages can replace
        // the service.
        startService(new Intent(Controller.this, RemoteService.class));
    };

    private View.OnClickListener mStopListener = v -> {
        // Cancel a previous call to startService().  Note that the
        // service will not actually stop at this point if there are
        // still bound clients.
        stopService(new Intent(Controller.this, RemoteService.class));
    };
}