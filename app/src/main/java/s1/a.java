package s1;

import android.app.Activity;
import android.app.Dialog;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.nabil.R;

public class a {

    private MediaPlayer f26003a;

    private SharedPreferences f26004b;

    private ImageView[] f26005c = new ImageView[26];

    private boolean[] f26006d = new boolean[26];

    private TextView[] f26007e = new TextView[26];

    private Typeface f26008f;


    class ViewOnClickListenerC0129a implements View.OnClickListener {

        final Activity f26009q;

        final Dialog f26010r;


        class C0130a implements MediaPlayer.OnCompletionListener {
            C0130a() {
            }

            @Override // android.media.MediaPlayer.OnCompletionListener
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.reset();
                mediaPlayer.release();
            }
        }

        ViewOnClickListenerC0129a(Activity activity, Dialog dialog) {
            this.f26009q = activity;
            this.f26010r = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (a.this.f26004b.getBoolean("EFFECTS", true)) {
                a.this.f26003a = MediaPlayer.create(this.f26009q, R.raw.closing_options);
                a.this.f26003a.setOnCompletionListener(new C0130a());
                a.this.f26003a.start();
            }
            this.f26010r.dismiss();
        }
    }

    public void d(Activity activity) {
        Dialog dialog = new Dialog(activity, R.style.DialogTheme);
        dialog.requestWindowFeature(1);
        int i7 = 0;
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.dialog_characters);
        this.f26004b = activity.getSharedPreferences("SharedPref", 0);
        dialog.getWindow().setFlags(8, 8);
        dialog.getWindow().addFlags(131200);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        Window window = dialog.getWindow();
        layoutParams.copyFrom(window.getAttributes());
        Display defaultDisplay = ((WindowManager) activity.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        layoutParams.width = point.x;
        layoutParams.height = -1;
        window.setAttributes(layoutParams);
        TextView textView = (TextView) dialog.findViewById(R.id.title);
        Typeface a8 = t1.b.a(activity);
        this.f26008f = a8;
        textView.setTypeface(a8);
        this.f26006d[1] = this.f26004b.getBoolean("CHAR_1", false);
        this.f26006d[2] = this.f26004b.getBoolean("CHAR_2", false);
        this.f26006d[3] = this.f26004b.getBoolean("CHAR_3", false);
        this.f26006d[4] = this.f26004b.getBoolean("CHAR_4", false);
        this.f26006d[5] = this.f26004b.getBoolean("CHAR_5", false);
        this.f26006d[6] = this.f26004b.getBoolean("CHAR_6", false);
        this.f26006d[7] = this.f26004b.getBoolean("CHAR_7", false);
        this.f26006d[8] = this.f26004b.getBoolean("CHAR_8", false);
        this.f26006d[9] = this.f26004b.getBoolean("CHAR_9", false);
        this.f26006d[10] = this.f26004b.getBoolean("CHAR_10", false);
        this.f26006d[11] = this.f26004b.getBoolean("CHAR_11", false);
        this.f26006d[12] = this.f26004b.getBoolean("CHAR_12", false);
        this.f26006d[13] = this.f26004b.getBoolean("CHAR_13", false);
        this.f26006d[14] = this.f26004b.getBoolean("CHAR_14", false);
        this.f26006d[15] = this.f26004b.getBoolean("CHAR_15", false);
        this.f26006d[16] = this.f26004b.getBoolean("CHAR_16", false);
        this.f26006d[17] = this.f26004b.getBoolean("CHAR_17", false);
        this.f26006d[18] = this.f26004b.getBoolean("CHAR_18", false);
        this.f26006d[19] = this.f26004b.getBoolean("CHAR_19", false);
        boolean[] zArr = this.f26006d;
        zArr[20] = true;
        zArr[21] = this.f26004b.getBoolean("CHAR_21", false);
        this.f26006d[22] = this.f26004b.getBoolean("CHAR_22", false);
        this.f26006d[24] = this.f26004b.getBoolean("CHAR_24", false);
        this.f26006d[25] = this.f26004b.getBoolean("CHAR_25", false);
        this.f26006d[0] = this.f26004b.getBoolean("CHAR_00", false);
        this.f26005c[1] = (ImageView) dialog.findViewById(R.id.character_image_1);
        this.f26005c[2] = (ImageView) dialog.findViewById(R.id.character_image_2);
        this.f26005c[3] = (ImageView) dialog.findViewById(R.id.character_image_3);
        this.f26005c[4] = (ImageView) dialog.findViewById(R.id.character_image_4);
        this.f26005c[5] = (ImageView) dialog.findViewById(R.id.character_image_5);
        this.f26005c[6] = (ImageView) dialog.findViewById(R.id.character_image_6);
        this.f26005c[7] = (ImageView) dialog.findViewById(R.id.character_image_7);
        this.f26005c[9] = (ImageView) dialog.findViewById(R.id.character_image_9);
        this.f26005c[10] = (ImageView) dialog.findViewById(R.id.character_image_10);
        this.f26005c[11] = (ImageView) dialog.findViewById(R.id.character_image_11);
        this.f26005c[12] = (ImageView) dialog.findViewById(R.id.character_image_12);
        this.f26005c[13] = (ImageView) dialog.findViewById(R.id.character_image_13);
        this.f26005c[14] = (ImageView) dialog.findViewById(R.id.character_image_14);
        this.f26005c[15] = (ImageView) dialog.findViewById(R.id.character_image_15);
        this.f26005c[16] = (ImageView) dialog.findViewById(R.id.character_image_16);
        this.f26005c[17] = (ImageView) dialog.findViewById(R.id.character_image_17);
        this.f26005c[18] = (ImageView) dialog.findViewById(R.id.character_image_18);
        this.f26005c[19] = (ImageView) dialog.findViewById(R.id.character_image_19);
        this.f26005c[20] = (ImageView) dialog.findViewById(R.id.character_image_20);
        this.f26005c[21] = (ImageView) dialog.findViewById(R.id.character_image_21);
        this.f26005c[22] = (ImageView) dialog.findViewById(R.id.character_image_22);
        this.f26005c[24] = (ImageView) dialog.findViewById(R.id.character_image_24);
        this.f26005c[25] = (ImageView) dialog.findViewById(R.id.character_image_25);
        this.f26005c[0] = (ImageView) dialog.findViewById(R.id.character_image_00);
        this.f26007e[1] = (TextView) dialog.findViewById(R.id.character_text_1);
        this.f26007e[2] = (TextView) dialog.findViewById(R.id.character_text_2);
        this.f26007e[3] = (TextView) dialog.findViewById(R.id.character_text_3);
        this.f26007e[4] = (TextView) dialog.findViewById(R.id.character_text_4);
        this.f26007e[5] = (TextView) dialog.findViewById(R.id.character_text_5);
        this.f26007e[6] = (TextView) dialog.findViewById(R.id.character_text_6);
        this.f26007e[7] = (TextView) dialog.findViewById(R.id.character_text_7);
        this.f26007e[9] = (TextView) dialog.findViewById(R.id.character_text_9);
        this.f26007e[10] = (TextView) dialog.findViewById(R.id.character_text_10);
        this.f26007e[11] = (TextView) dialog.findViewById(R.id.character_text_11);
        this.f26007e[12] = (TextView) dialog.findViewById(R.id.character_text_12);
        this.f26007e[13] = (TextView) dialog.findViewById(R.id.character_text_13);
        this.f26007e[14] = (TextView) dialog.findViewById(R.id.character_text_14);
        this.f26007e[15] = (TextView) dialog.findViewById(R.id.character_text_15);
        this.f26007e[16] = (TextView) dialog.findViewById(R.id.character_text_16);
        this.f26007e[17] = (TextView) dialog.findViewById(R.id.character_text_17);
        this.f26007e[18] = (TextView) dialog.findViewById(R.id.character_text_18);
        this.f26007e[19] = (TextView) dialog.findViewById(R.id.character_text_19);
        this.f26007e[20] = (TextView) dialog.findViewById(R.id.character_text_20);
        this.f26007e[21] = (TextView) dialog.findViewById(R.id.character_text_21);
        this.f26007e[22] = (TextView) dialog.findViewById(R.id.character_text_22);
        this.f26007e[24] = (TextView) dialog.findViewById(R.id.character_text_24);
        this.f26007e[25] = (TextView) dialog.findViewById(R.id.character_text_25);
        this.f26007e[0] = (TextView) dialog.findViewById(R.id.character_text_00);
        while (true) {
            ImageView[] imageViewArr = this.f26005c;
            if (i7 >= imageViewArr.length) {
                ((ImageView) dialog.findViewById(R.id.close_button)).setOnClickListener(new ViewOnClickListenerC0129a(activity, dialog));
                dialog.show();
                dialog.getWindow().getDecorView().setSystemUiVisibility(activity.getWindow().getDecorView().getSystemUiVisibility());
                dialog.getWindow().clearFlags(8);
                return;
            }
            ImageView imageView = imageViewArr[i7];
            if (imageView != null) {
                if (!this.f26006d[i7]) {
                    imageView.setImageDrawable(activity.getResources().getDrawable(R.drawable.empty_card));
                    this.f26007e[i7].setText("? ? ?");
                }
                this.f26007e[i7].setTypeface(this.f26008f);
            }
            i7++;
        }
    }
}
