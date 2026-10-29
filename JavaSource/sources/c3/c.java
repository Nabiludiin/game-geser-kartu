package c3;

import android.net.Uri;
import com.google.android.gms.internal.ads.q00;
import java.util.Map;

/* compiled from: MyApplication */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f3490a = (String) q00.f14189a.e();

    public String a(Map map) {
        Uri.Builder buildUpon = Uri.parse(this.f3490a).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return buildUpon.build().toString();
    }
}
