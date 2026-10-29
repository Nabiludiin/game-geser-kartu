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
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.nabil.R;
import java.util.ArrayList;
import t1.d;
import t1.i;

public class c {

    private MediaPlayer f26038a;

    private SharedPreferences f26039b;

    private Typeface f26040c;

    class a implements View.OnClickListener {

        final Activity f26041q;

        final Dialog f26042r;


        class C0132a implements MediaPlayer.OnCompletionListener {
            C0132a() {
            }

            @Override // android.media.MediaPlayer.OnCompletionListener
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.reset();
                mediaPlayer.release();
            }
        }

        a(Activity activity, Dialog dialog) {
            this.f26041q = activity;
            this.f26042r = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (c.this.f26039b.getBoolean("EFFECTS", true)) {
                c.this.f26038a = MediaPlayer.create(this.f26041q, R.raw.closing_options);
                c.this.f26038a.setOnCompletionListener(new C0132a());
                c.this.f26038a.start();
            }
            this.f26042r.dismiss();
        }
    }

    public void d(Activity activity) {
        Dialog dialog = new Dialog(activity, R.style.DialogTheme);
        dialog.requestWindowFeature(1);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.dialog_storyline);
        i iVar = new i(activity);
        this.f26039b = activity.getSharedPreferences("SharedPref", 0);
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
        this.f26040c = a8;
        textView.setTypeface(a8);
        ListView listView = (ListView) dialog.findViewById(R.id.goals_list);
        ArrayList arrayList = new ArrayList();
        ArrayList c8 = iVar.c("MyGoals", t1.c.class);
        for (int i7 = 0; i7 < c8.size(); i7++) {
            arrayList.add((t1.c) c8.get(i7));
        }
        listView.setAdapter((ListAdapter) new d(arrayList, activity.getApplicationContext()));
        ((ImageView) dialog.findViewById(R.id.close_button)).setOnClickListener(new a(activity, dialog));
        dialog.show();
        dialog.getWindow().getDecorView().setSystemUiVisibility(activity.getWindow().getDecorView().getSystemUiVisibility());
        dialog.getWindow().clearFlags(8);
    }
}
