package b3;

import android.os.Bundle;
import android.util.JsonReader;
import com.google.android.gms.internal.ads.eh0;
import com.google.android.gms.internal.ads.uy;
import com.google.android.gms.internal.ads.yw1;
import java.util.HashMap;
import java.util.Map;

/* compiled from: MyApplication */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f3293a;

    /* renamed from: b, reason: collision with root package name */
    public String f3294b;

    /* renamed from: d, reason: collision with root package name */
    public eh0 f3296d;

    /* renamed from: e, reason: collision with root package name */
    public Bundle f3297e;

    /* renamed from: g, reason: collision with root package name */
    private long f3299g;

    /* renamed from: h, reason: collision with root package name */
    private long f3300h;

    /* renamed from: c, reason: collision with root package name */
    public String f3295c = null;

    /* renamed from: f, reason: collision with root package name */
    public Bundle f3298f = new Bundle();

    public m0(JsonReader jsonReader, eh0 eh0Var) {
        Bundle bundle;
        this.f3299g = -1L;
        this.f3300h = -1L;
        this.f3296d = eh0Var;
        HashMap hashMap = new HashMap();
        jsonReader.beginObject();
        String str = "";
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName = nextName == null ? "" : nextName;
            switch (nextName.hashCode()) {
                case -1573145462:
                    if (nextName.equals("start_time")) {
                        this.f3299g = jsonReader.nextLong();
                        break;
                    } else {
                        jsonReader.skipValue();
                        break;
                    }
                case -995427962:
                    if (nextName.equals("params")) {
                        str = jsonReader.nextString();
                        break;
                    } else {
                        jsonReader.skipValue();
                        break;
                    }
                case -271442291:
                    if (nextName.equals("signal_dictionary")) {
                        hashMap = new HashMap();
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            hashMap.put(jsonReader.nextName(), jsonReader.nextString());
                        }
                        jsonReader.endObject();
                        break;
                    } else {
                        jsonReader.skipValue();
                        break;
                    }
                case 1725551537:
                    if (nextName.equals("end_time")) {
                        this.f3300h = jsonReader.nextLong();
                        break;
                    } else {
                        jsonReader.skipValue();
                        break;
                    }
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        this.f3293a = str;
        jsonReader.endObject();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                this.f3298f.putString((String) entry.getKey(), (String) entry.getValue());
            }
        }
        if (!((Boolean) s2.b0.c().d(uy.f17224v2)).booleanValue() || eh0Var == null || (bundle = eh0Var.C) == null) {
            return;
        }
        bundle.putLong(yw1.GET_SIGNALS_SDKCORE_START.c(), this.f3299g);
        eh0Var.C.putLong(yw1.GET_SIGNALS_SDKCORE_END.c(), this.f3300h);
    }
}
