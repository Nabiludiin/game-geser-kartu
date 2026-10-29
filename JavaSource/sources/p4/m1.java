package p4;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: MyApplication */
public final class m1 {

    /* renamed from: d, reason: collision with root package name */
    private static final e2 f25459d = e2.n("UMP_CoMoAdStoragePurposeConsentStatus", "UMP_CoMoAdUserDataPurposeConsentStatus", "UMP_CoMoAdPersonalizationPurposeConsentStatus", "UMP_CoMoAnalyticsStoragePurposeConsentStatus", "IABTCF_gdprApplies");

    /* renamed from: b, reason: collision with root package name */
    private final Context f25461b;

    /* renamed from: a, reason: collision with root package name */
    private final Map f25460a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Map f25462c = new HashMap();

    public m1(Context context) {
        this.f25461b = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedPreferences.Editor f(String str) {
        Map map = this.f25462c;
        if (!map.containsKey(str)) {
            map.put(str, this.f25461b.getSharedPreferences(str, 0).edit());
        }
        return (SharedPreferences.Editor) map.get(str);
    }

    public final Map b() {
        return this.f25460a;
    }

    public final void c() {
        Iterator it = this.f25462c.values().iterator();
        while (it.hasNext()) {
            ((SharedPreferences.Editor) it.next()).commit();
        }
    }

    public final void d() {
        this.f25460a.clear();
    }

    public final boolean e(String str, Object obj) {
        l1 a8 = n1.a(this.f25461b, str);
        if (a8 == null) {
            return false;
        }
        SharedPreferences.Editor f8 = f(a8.f25448a);
        if (obj instanceof Integer) {
            Integer num = (Integer) obj;
            String str2 = a8.f25449b;
            f8.putInt(str2, num.intValue());
            if (!f25459d.contains(str2)) {
                return true;
            }
            this.f25460a.put(str2, num);
            return true;
        }
        if (obj instanceof Long) {
            f8.putLong(a8.f25449b, ((Long) obj).longValue());
            return true;
        }
        if (obj instanceof Double) {
            f8.putFloat(a8.f25449b, ((Double) obj).floatValue());
            return true;
        }
        if (obj instanceof Float) {
            f8.putFloat(a8.f25449b, ((Float) obj).floatValue());
            return true;
        }
        if (obj instanceof Boolean) {
            f8.putBoolean(a8.f25449b, ((Boolean) obj).booleanValue());
            return true;
        }
        if (!(obj instanceof String)) {
            return false;
        }
        f8.putString(a8.f25449b, (String) obj);
        return true;
    }
}
