package s1;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.net.Uri;
import android.text.method.LinkMovementMethod;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.nabil.R;
import t1.i;

public class b {

    private Activity f26013a;

    private MediaPlayer f26014b;

    private SharedPreferences f26015c;

    private SharedPreferences.Editor f26016d;

    private boolean f26017e = false;

    private int f26018f;

    private int f26019g;

    private int f26020h;

    private boolean f26021i;

    private boolean f26022j;

    private Typeface f26023k;

    class a implements View.OnClickListener {

        final TextView f26024q;

        final TextView f26025r;

        a(TextView textView, TextView textView2) {
            this.f26024q = textView;
            this.f26025r = textView2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f26024q.setVisibility(8);
            this.f26025r.setVisibility(0);
        }
    }


    class ViewOnClickListenerC0131b implements View.OnClickListener {
        ViewOnClickListenerC0131b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b.this.s();
        }
    }

    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b.this.p(1);
        }
    }

    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b.this.p(2);
        }
    }

    class e implements View.OnClickListener {

        final Activity f26030q;

        e(Activity activity) {
            this.f26030q = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f26030q.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("ini punya nabiludin jangan banyak tanya soal kepemilikan")));
        }
    }

    class f implements View.OnClickListener {

        final Activity f26032q;

        final Dialog f26033r;

        class a implements MediaPlayer.OnCompletionListener {
            a() {
            }

            @Override // android.media.MediaPlayer.OnCompletionListener
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.reset();
                mediaPlayer.release();
            }
        }

        f(Activity activity, Dialog dialog) {
            this.f26032q = activity;
            this.f26033r = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (b.this.f26015c.getBoolean("EFFECTS", true)) {
                b.this.f26014b = MediaPlayer.create(this.f26032q, R.raw.closing_options);
                b.this.f26014b.setOnCompletionListener(new a());
                b.this.f26014b.start();
            }
            this.f26033r.dismiss();
        }
    }

    class g implements DialogInterface.OnClickListener {
        g() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i7) {
            boolean z7 = b.this.f26017e;
            int i8 = b.this.f26018f;
            int i9 = b.this.f26019g;
            int i10 = b.this.f26020h;
            boolean z8 = b.this.f26021i;
            boolean z9 = b.this.f26022j;
            b.this.f26015c.edit().clear().commit();
            new i(b.this.f26013a).b();
            b bVar = b.this;
            bVar.f26016d = bVar.f26015c.edit();
            b.this.f26016d.putBoolean("ADS_WARNING", z8);
            b.this.f26016d.putBoolean("GAME_REVIEWED", z9);
            b.this.f26016d.putBoolean("PREMIUM_VERSION", z7);
            b.this.f26016d.putInt("AMOUNT_ITEM_1", i8);
            b.this.f26016d.putInt("AMOUNT_ITEM_2", i9);
            b.this.f26016d.putInt("AMOUNT_ITEM_3", i10);
            b.this.f26016d.commit();
            dialogInterface.dismiss();
            b.this.q();
        }
    }

    class h implements DialogInterface.OnClickListener {
        h() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i7) {
            dialogInterface.dismiss();
        }
    }

    public void p(int i7) {
        Uri parse = Uri.parse("https://www.facebook.com/gesergames");
        if (i7 == 2) {
            parse = Uri.parse("https://geser2.page.link/insta");
        }
        this.f26013a.startActivity(new Intent("android.intent.action.VIEW", parse));
    }

    public void q() {
        Intent launchIntentForPackage = this.f26013a.getBaseContext().getPackageManager().getLaunchIntentForPackage(this.f26013a.getBaseContext().getPackageName());
        launchIntentForPackage.addFlags(67108864);
        this.f26013a.finish();
        this.f26013a.startActivity(launchIntentForPackage);
    }

    public void s() {
        AlertDialog create = new AlertDialog.Builder(this.f26013a).create();
        try {
            create.getWindow().setFlags(8, 8);
            create.getWindow().addFlags(131200);
        } catch (NullPointerException e8) {
            System.out.println("ShowresetDialog Exc: " + e8);
        }
        create.setTitle(this.f26013a.getResources().getText(R.string.attention));
        create.setMessage(this.f26013a.getResources().getText(R.string.hard_reset_warning));
        create.setButton(-1, this.f26013a.getResources().getText(R.string.yes), new g());
        create.setButton(-2, this.f26013a.getResources().getText(R.string.cancel), new h());
        create.show();
    }

    public void r(Activity activity) {
        Dialog dialog = new Dialog(activity, R.style.DialogTheme);
        dialog.requestWindowFeature(1);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.dialog_info);
        this.f26013a = activity;
        this.f26015c = activity.getSharedPreferences("SharedPref", 0);
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
        this.f26023k = a8;
        textView.setTypeface(a8);
        this.f26017e = this.f26015c.getBoolean("PREMIUM_VERSION", this.f26017e);
        this.f26018f = this.f26015c.getInt("AMOUNT_ITEM_1", 0);
        this.f26019g = this.f26015c.getInt("AMOUNT_ITEM_2", 0);
        this.f26020h = this.f26015c.getInt("AMOUNT_ITEM_3", 0);
        this.f26021i = this.f26015c.getBoolean("ADS_WARNING", false);
        this.f26022j = this.f26015c.getBoolean("GAME_REVIEWED", false);
        TextView textView2 = (TextView) dialog.findViewById(R.id.developer_title);
        TextView textView3 = (TextView) dialog.findViewById(R.id.developer_name);
        TextView textView4 = (TextView) dialog.findViewById(R.id.graphic_title);
        TextView textView5 = (TextView) dialog.findViewById(R.id.graphic_name);
        TextView textView6 = (TextView) dialog.findViewById(R.id.translation_title);
        TextView textView7 = (TextView) dialog.findViewById(R.id.translation_name);
        TextView textView8 = (TextView) dialog.findViewById(R.id.sounds_title);
        TextView textView9 = (TextView) dialog.findViewById(R.id.sounds_name);
        TextView textView10 = (TextView) dialog.findViewById(R.id.license_title);
        TextView textView11 = (TextView) dialog.findViewById(R.id.license_content);
        TextView textView12 = (TextView) dialog.findViewById(R.id.license_name);
        TextView textView13 = (TextView) dialog.findViewById(R.id.copyright_title);
        TextView textView14 = (TextView) dialog.findViewById(R.id.facebook_text);
        TextView textView15 = (TextView) dialog.findViewById(R.id.instagram_text);
        TextView textView16 = (TextView) dialog.findViewById(R.id.my_site_text);
        textView2.setTypeface(this.f26023k);
        textView3.setTypeface(this.f26023k);
        textView4.setTypeface(this.f26023k);
        textView5.setTypeface(this.f26023k);
        textView6.setTypeface(this.f26023k);
        textView7.setTypeface(this.f26023k);
        textView8.setTypeface(this.f26023k);
        textView9.setTypeface(this.f26023k);
        textView10.setTypeface(this.f26023k);
        textView11.setTypeface(this.f26023k);
        textView12.setTypeface(this.f26023k);
        textView13.setTypeface(this.f26023k);
        textView14.setTypeface(this.f26023k);
        textView15.setTypeface(this.f26023k);
        textView16.setTypeface(this.f26023k);
        try {
            textView11.setMovementMethod(LinkMovementMethod.getInstance());
        } catch (Exception unused) {
        }
        textView12.setOnClickListener(new a(textView12, textView11));
        TextView textView17 = (TextView) dialog.findViewById(R.id.hard_reset_button);
        textView17.setTypeface(this.f26023k);
        textView17.setOnClickListener(new ViewOnClickListenerC0131b());
        dialog.findViewById(R.id.facebook_view).setOnClickListener(new c());
        dialog.findViewById(R.id.instagram_view).setOnClickListener(new d());
        textView16.setOnClickListener(new e(activity));
        ((ImageView) dialog.findViewById(R.id.close_button)).setOnClickListener(new f(activity, dialog));
        dialog.show();
        dialog.getWindow().getDecorView().setSystemUiVisibility(activity.getWindow().getDecorView().getSystemUiVisibility());
        dialog.getWindow().clearFlags(8);
    }
}
