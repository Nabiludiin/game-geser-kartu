package b3;

import com.google.android.gms.internal.ads.hx3;
import java.util.List;
import org.json.JSONObject;

/* compiled from: MyApplication */
final /* synthetic */ class s implements hx3 {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ s f3344a = new s();

    private /* synthetic */ s() {
    }

    @Override // com.google.android.gms.internal.ads.hx3
    public final /* synthetic */ Object apply(Object obj) {
        List list = w.W;
        return ((JSONObject) obj).optString("nas");
    }
}
