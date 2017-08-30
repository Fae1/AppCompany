package appcompany.studio.com.appcompany;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView companyImg;
    private ImageView serviceImg;
    private ImageView clientImg;
    private ImageView contactImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        companyImg = (ImageView) findViewById(R.id.companyImgId);
        serviceImg = (ImageView) findViewById(R.id.serviceImgId);
        clientImg = (ImageView) findViewById(R.id.clientImgId);
        contactImg = (ImageView) findViewById(R.id.contactImgId);


        companyImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, CompanyActivity.class));
            }
        });

        serviceImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ServiceActivity.class));
            }
        });

        clientImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ClientActivity.class));
            }
        });

        contactImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ContactActivity.class));
            }
        });
    }
}
