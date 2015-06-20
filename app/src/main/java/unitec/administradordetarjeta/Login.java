package unitec.administradordetarjeta;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Login extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
              Button boton=(Button)findViewById(R.id.botonAutenticar);

    boton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            EditText textoLogin=(EditText)findViewById(R.id.editLogin);
            EditText textoPassword=(EditText)findViewById(R.id.editPassword);
            String login=textoLogin.getText().toString();
            String password=textoPassword.getText().toString();
            boolean autenticacion=Usuario.auntenticar(login, password);
            if(autenticacion){
                Intent i=new Intent(getApplicationContext(), ActivityMenu.class);
                startActivity(i);
                finish();
            }else{
               Toast.makeText(getApplicationContext()," No seas menso pon bien" +
                               " tus datos", Toast.LENGTH_LONG).show();

            }

        }
    });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
