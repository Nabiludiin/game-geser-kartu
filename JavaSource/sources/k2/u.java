package k2;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s2.k5;
import s2.y2;

/* compiled from: MyApplication */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    private final y2 f24444a;

    /* renamed from: b, reason: collision with root package name */
    private final List f24445b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private j f24446c;

    private u(y2 y2Var) {
        this.f24444a = y2Var;
        if (y2Var != null) {
            try {
                List f8 = y2Var.f();
                if (f8 != null) {
                    Iterator it = f8.iterator();
                    while (it.hasNext()) {
                        j e8 = j.e((k5) it.next());
                        if (e8 != null) {
                            this.f24445b.add(e8);
                        }
                    }
                }
            } catch (RemoteException e9) {
                w2.p.d("Could not forward getAdapterResponseInfo to ResponseInfo.", e9);
            }
        }
        y2 y2Var2 = this.f24444a;
        if (y2Var2 == null) {
            return;
        }
        try {
            k5 g8 = y2Var2.g();
            if (g8 != null) {
                this.f24446c = j.e(g8);
            }
        } catch (RemoteException e10) {
            w2.p.d("Could not forward getLoadedAdapterResponse to ResponseInfo.", e10);
        }
    }

    public static u e(y2 y2Var) {
        if (y2Var != null) {
            return new u(y2Var);
        }
        return null;
    }

    public static u f(y2 y2Var) {
        return new u(y2Var);
    }

    public String a() {
        try {
            y2 y2Var = this.f24444a;
            if (y2Var != null) {
                return y2Var.c();
            }
            return null;
        } catch (RemoteException e8) {
            w2.p.d("Could not forward getMediationAdapterClassName to ResponseInfo.", e8);
            return null;
        }
    }

    public Bundle b() {
        try {
            y2 y2Var = this.f24444a;
            if (y2Var != null) {
                return y2Var.j();
            }
        } catch (RemoteException e8) {
            w2.p.d("Could not forward getResponseExtras to ResponseInfo.", e8);
        }
        return new Bundle();
    }

    public String c() {
        try {
            y2 y2Var = this.f24444a;
            if (y2Var != null) {
                return y2Var.e();
            }
            return null;
        } catch (RemoteException e8) {
            w2.p.d("Could not forward getResponseId to ResponseInfo.", e8);
            return null;
        }
    }

    public final JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        String c8 = c();
        if (c8 == null) {
            jSONObject.put("Response ID", "null");
        } else {
            jSONObject.put("Response ID", c8);
        }
        String a8 = a();
        if (a8 == null) {
            jSONObject.put("Mediation Adapter Class Name", "null");
        } else {
            jSONObject.put("Mediation Adapter Class Name", a8);
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f24445b.iterator();
        while (it.hasNext()) {
            jSONArray.put(((j) it.next()).f());
        }
        jSONObject.put("Adapter Responses", jSONArray);
        j jVar = this.f24446c;
        if (jVar != null) {
            jSONObject.put("Loaded Adapter Response", jVar.f());
        }
        Bundle b8 = b();
        if (b8 != null) {
            jSONObject.put("Response Extras", s2.z.a().u(b8));
        }
        return jSONObject;
    }

    public final y2 g() {
        return this.f24444a;
    }

    public String toString() {
        try {
            return d().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
