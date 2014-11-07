// Pieter van Dijk
// pieter.vandijk1@gmail.com
// 10252088

package nl.mprog.setup.Hello10252088;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Screen2 extends MainActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_2);
    }

    public void BackScreen(View view) {
        Intent intent = new Intent(Screen2.this, MainActivity.class);
        startActivity(intent);
    }

}
