package t1;

import android.app.Activity;
import android.content.SharedPreferences;
import android.widget.TextView;
import com.nabil.R;
import java.util.Random;

class h {

    private Activity f26376a;

    private int f26377b;

    private int f26378c;

    private TextView f26379d;

    private TextView f26380e;

    private TextView f26381f;

    private TextView f26382g;

    private TextView f26383h;

    private int f26384i;

    private int f26385j;

    private SharedPreferences f26386k;

    private SharedPreferences.Editor f26387l;

    h(Activity activity) {
        this.f26376a = activity;
        SharedPreferences sharedPreferences = activity.getSharedPreferences("SharedPref", 0);
        this.f26386k = sharedPreferences;
        this.f26377b = 1;
        this.f26378c = 0;
        int i7 = sharedPreferences.getInt("TIME", 0);
        this.f26384i = i7;
        this.f26385j = (i7 / 365) + 2075;
        this.f26379d = (TextView) activity.findViewById(R.id.year_text);
        this.f26380e = (TextView) activity.findViewById(R.id.years_count);
        this.f26381f = (TextView) activity.findViewById(R.id.yeasr_text);
        this.f26382g = (TextView) activity.findViewById(R.id.days_count);
        this.f26383h = (TextView) activity.findViewById(R.id.days_text);
        c();
    }

    int a() {
        return this.f26377b + (this.f26378c * 365);
    }

    int b() {
        return this.f26385j;
    }

    void c() {
        int nextInt = new Random().nextInt(38);
        System.out.println("Refreshing time: " + this.f26385j + " " + this.f26377b);
        int i7 = this.f26377b;
        if (i7 + nextInt > 365) {
            this.f26378c++;
            this.f26377b = nextInt - (365 - i7);
        } else {
            this.f26377b = i7 + nextInt;
        }
        if (this.f26377b == 1) {
            this.f26383h.setText(" " + this.f26376a.getString(R.string.day));
        } else {
            this.f26383h.setText(" " + this.f26376a.getString(R.string.days));
        }
        int i8 = this.f26378c;
        if (i8 > 0) {
            if (i8 == 1) {
                this.f26381f.setText(" " + this.f26376a.getString(R.string.year) + " ");
            } else {
                this.f26381f.setText(" " + this.f26376a.getString(R.string.years) + " ");
            }
            this.f26381f.setVisibility(0);
            this.f26380e.setVisibility(0);
            this.f26380e.setText("" + this.f26378c);
        } else {
            this.f26381f.setVisibility(8);
            this.f26380e.setVisibility(8);
        }
        if (this.f26376a.getString(R.string.prefix).equals("sk")) {
            int i9 = this.f26377b;
            if (i9 > 1 && i9 < 5) {
                this.f26383h.setText(" dni");
            }
            if (this.f26378c > 4) {
                this.f26381f.setText(" rokov a ");
            }
        } else if (this.f26376a.getString(R.string.prefix).equals("sl")) {
            if (this.f26377b == 2) {
                this.f26383h.setText(" dneva");
            }
            if (this.f26378c == 2) {
                this.f26381f.setText(" leti in ");
            }
        }
        this.f26382g.setText("" + this.f26377b);
        this.f26379d.setText("" + this.f26385j);
        this.f26385j = (((this.f26384i + (this.f26378c * 365)) + this.f26377b) / 365) + 2075;
    }

    void d() {
        this.f26384i = this.f26384i + (this.f26378c * 365) + this.f26377b;
        SharedPreferences.Editor edit = this.f26386k.edit();
        this.f26387l = edit;
        edit.putInt("TIME", this.f26384i);
        this.f26387l.apply();
    }
}
