package androidx.privacysandbox.ads.adservices.topics;

import android.adservices.topics.GetTopicsRequest;

/* compiled from: MyApplication */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f2579a = new h();

    private h() {
    }

    public final GetTopicsRequest a(c cVar) {
        GetTopicsRequest.Builder adsSdkName;
        GetTopicsRequest.Builder shouldRecordObservation;
        GetTopicsRequest build;
        q6.i.e(cVar, "request");
        adsSdkName = d.a().setAdsSdkName(cVar.a());
        shouldRecordObservation = adsSdkName.setShouldRecordObservation(cVar.b());
        build = shouldRecordObservation.build();
        q6.i.d(build, "Builder()\n            .s…ion)\n            .build()");
        return build;
    }

    public final GetTopicsRequest b(c cVar) {
        GetTopicsRequest.Builder adsSdkName;
        GetTopicsRequest build;
        q6.i.e(cVar, "request");
        adsSdkName = d.a().setAdsSdkName(cVar.a());
        build = adsSdkName.build();
        q6.i.d(build, "Builder()\n            .s…ame)\n            .build()");
        return build;
    }
}
