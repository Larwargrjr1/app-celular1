package series.studio.com.br.series;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    private SeekBar sb;
    private ImageView img;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sb = (SeekBar) findViewById(R.id.sb);
        img = (ImageView) findViewById(R.id.img);

        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                int valor = i;
                if(valor == 1){
                    img.setImageResource(R.drawable.pouco);
                }else if(valor == 2){
                    img.setImageResource(R.drawable.medio);
                }else if(valor == 3){
                    img.setImageResource(R.drawable.muito);
                }else if(valor == 4){
                    img.setImageResource(R.drawable.susto);

                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
