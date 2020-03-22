package id.dwichan.calc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
    //Button btPesanDua, btTampilkanNama, btTambah, btKurang, btKali, btBagi;
    EditText etNama, etBill, etBill2, etHasil;

    @Override
    public void onCreate(Bundle savedInstance) {
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_main);
        etNama = (EditText) findViewById(R.id.etNama);
        etBill = (EditText) findViewById(R.id.etBill);
        etBill2 = (EditText) findViewById(R.id.etBill2);
        etHasil = (EditText) findViewById(R.id.etHasil);

        Button btNama = (Button) findViewById((R.id.btTampilNama));
        btNama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Nama: " + etNama.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void tampilkanPesan(View view) {
        Toast.makeText(MainActivity.this, "Selamat belajar Android :v", Toast.LENGTH_SHORT).show();
    }

    public void tampilkanPesan2(View view) {
        Toast.makeText(MainActivity.this, "Tombol Dua", Toast.LENGTH_SHORT).show();
    }

    public void tambah(View view) {
        Double hasil = Double.parseDouble(etBill.getText().toString()) + Double.parseDouble(etBill2.getText().toString());

        etHasil.setText(hasil.toString());
        Toast.makeText(this, "Hasil: " + hasil.toString(), Toast.LENGTH_SHORT).show();
    }

    public void kurang(View view) {
        Double hasil = Double.parseDouble(etBill.getText().toString()) - Double.parseDouble(etBill2.getText().toString());

        etHasil.setText(hasil.toString());
        Toast.makeText(this, "Hasil: " + hasil.toString(), Toast.LENGTH_SHORT).show();
    }

    public void kali(View view) {
        Double hasil = Double.parseDouble(etBill.getText().toString()) * Double.parseDouble(etBill2.getText().toString());

        etHasil.setText(hasil.toString());
        Toast.makeText(this, "Hasil: " + hasil.toString(), Toast.LENGTH_SHORT).show();
    }

    public void bagi(View view) {
        Double hasil = Double.parseDouble(etBill.getText().toString()) / Double.parseDouble(etBill2.getText().toString());

        etHasil.setText(hasil.toString());
        Toast.makeText(this, "Hasil: " + hasil.toString(), Toast.LENGTH_SHORT).show();
    }
}
