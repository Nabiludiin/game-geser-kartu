package t1;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: MyApplication */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private SharedPreferences f26388a;

    /* renamed from: b, reason: collision with root package name */
    private String f26389b = "";

    public i(Context context) {
        this.f26388a = PreferenceManager.getDefaultSharedPreferences(context);
    }

    public void a(String str) {
        str.getClass();
    }

    public void b() {
        this.f26388a.edit().clear().apply();
    }

    public ArrayList c(String str, Class cls) {
        w5.d dVar = new w5.d();
        ArrayList d8 = d(str);
        ArrayList arrayList = new ArrayList();
        int size = d8.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = d8.get(i7);
            i7++;
            arrayList.add(dVar.h((String) obj, cls));
        }
        return arrayList;
    }

    public ArrayList d(String str) {
        return new ArrayList(Arrays.asList(TextUtils.split(this.f26388a.getString(str, ""), "‚‗‚")));
    }

    public void e(String str, ArrayList arrayList) {
        a(str);
        w5.d dVar = new w5.d();
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            arrayList2.add(dVar.o(obj));
        }
        f(str, arrayList2);
    }

    public void f(String str, ArrayList arrayList) {
        a(str);
        this.f26388a.edit().putString(str, TextUtils.join("‚‗‚", (String[]) arrayList.toArray(new String[arrayList.size()]))).apply();
    }
}
