package p3;

import android.content.Context;
import android.content.res.Resources;

/* compiled from: MyApplication */
public class r {

    /* renamed from: a, reason: collision with root package name */
    private final Resources f25267a;

    /* renamed from: b, reason: collision with root package name */
    private final String f25268b;

    public r(Context context) {
        o.m(context);
        Resources resources = context.getResources();
        this.f25267a = resources;
        this.f25268b = resources.getResourcePackageName(k3.m.f24516a);
    }

    public String a(String str) {
        int identifier = this.f25267a.getIdentifier(str, "string", this.f25268b);
        if (identifier == 0) {
            return null;
        }
        return this.f25267a.getString(identifier);
    }
}
