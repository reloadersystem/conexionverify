package resembrink.dev.conexioninternet;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button conexion;

    TextView status;

    ConnectionDetector cd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        conexion= findViewById(R.id.idconexion);
        status= findViewById(R.id.status);

        cd= new ConnectionDetector(this);

        conexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(cd.isConnected())
                {
                    Toast.makeText(getApplicationContext(),"Connected", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext()," not Connected", Toast.LENGTH_SHORT).show();
                }



            }
        });
    }
}
