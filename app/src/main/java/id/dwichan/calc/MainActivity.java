package id.dwichan.calc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    //Button btPesanDua, btTampilkanNama, btTambah, btKurang, btKali, btBagi;
    EditText etNama, etBill, etBill2, etHasil;
    TextView tvLoop;

    @Override
    public void onCreate(Bundle savedInstance) {
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_main);
        etNama = (EditText) findViewById(R.id.etNama);
        etBill = (EditText) findViewById(R.id.etBill);
        etBill2 = (EditText) findViewById(R.id.etBill2);
        etHasil = (EditText) findViewById(R.id.etHasil);
        tvLoop = (TextView) findViewById(R.id.tvLoop);

        Button btNama = (Button) findViewById((R.id.btTampilNama));
        btNama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Nama: " + etNama.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
        Button btTambah = (Button) findViewById((R.id.btTambah));
        btTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prosesMatematika("Tambah");
            }
        });
        Button btKurang = (Button) findViewById((R.id.btKurang));
        btKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prosesMatematika("Kurang");
            }
        });
        Button btKali = (Button) findViewById((R.id.btKali));
        btKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prosesMatematika("Kali");
            }
        });
        Button btBagi = (Button) findViewById((R.id.btBagi));
        btBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prosesMatematika("Bagi");
            }
        });

        Button btWhile = (Button) findViewById(R.id.btWhile);
        btWhile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int loop = 2;
                tvLoop.setText("");
                while (loop <= 20) {
                    tvLoop.setText(tvLoop.getText().toString() + loop + ", ");
                    loop += 2;
                }
            }
        });

        Button btDoWhile = (Button) findViewById(R.id.btDoWhile);
        btDoWhile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int loop = 1;
                tvLoop.setText("");
                do {
                    tvLoop.setText(tvLoop.getText().toString() + loop + ", ");
                    loop += 2;
                } while (loop <= 20);
            }
        });

        Button btFor = (Button) findViewById(R.id.btFor);
        btFor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvLoop.setText("");
                for (int i = 1; i <= 10; i++) {
                    tvLoop.setText(tvLoop.getText().toString() + i + ", ");
                }
            }
        });
    }

    public void tampilkanPesan(View view) {
        Toast.makeText(MainActivity.this, "Selamat belajar Android :v", Toast.LENGTH_SHORT).show();
    }

    public void tampilkanPesan2(View view) {
        Toast.makeText(MainActivity.this, "Tombol Dua", Toast.LENGTH_SHORT).show();
    }

    public void prosesMatematika(String proses) {
        if (etBill.getText().toString().equalsIgnoreCase("")) {
            etBill.requestFocus();
            Toast.makeText(this, "Isi bilangan pertama!", Toast.LENGTH_SHORT).show();
        } else if (etBill2.getText().toString().equalsIgnoreCase("")) {
            etBill2.requestFocus();
            Toast.makeText(this, "Isi bilangan kedua!", Toast.LENGTH_SHORT).show();
        } else {
            Hitung ht = new Hitung(Double.parseDouble(etBill.getText().toString()), Double.parseDouble(etBill2.getText().toString()));
            switch (proses) {
                case "Tambah":
                    etHasil.setText(ht.getTambah().toString());
                    break;
                case "Kurang":
                    etHasil.setText(ht.getKurang().toString());
                    break;
                case "Kali":
                    etHasil.setText(ht.getKali().toString());
                    break;
                case "Bagi":
                    etHasil.setText(ht.getBagi().toString());
                    break;
                default:
                    Toast.makeText(MainActivity.this, "Invalid option", Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    }

}
