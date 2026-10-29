package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: MyApplication */
public final class ep0 implements y50 {
    @Override // com.google.android.gms.internal.ads.y50
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        bo0 bo0Var = (bo0) obj;
        us0 g8 = bo0Var.g();
        if (g8 == null) {
            try {
                us0 us0Var = new us0(bo0Var, Float.parseFloat((String) map.get("duration")), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                bo0Var.H0(us0Var);
                g8 = us0Var;
            } catch (NullPointerException e8) {
                e = e8;
                Throwable th = e;
                int i7 = v2.n1.f26802b;
                w2.p.d("Unable to parse videoMeta message.", th);
                r2.t.l().i(th, "VideoMetaGmsgHandler.onGmsg");
                return;
            } catch (NumberFormatException e9) {
                e = e9;
                Throwable th2 = e;
                int i72 = v2.n1.f26802b;
                w2.p.d("Unable to parse videoMeta message.", th2);
                r2.t.l().i(th2, "VideoMetaGmsgHandler.onGmsg");
                return;
            }
        }
        float parseFloat = Float.parseFloat((String) map.get("duration"));
        boolean equals = "1".equals(map.get("muted"));
        float parseFloat2 = Float.parseFloat((String) map.get("currentTime"));
        int parseInt = Integer.parseInt((String) map.get("playbackState"));
        if (parseInt < 0 || parseInt > 3) {
            parseInt = 0;
        }
        String str = (String) map.get("aspectRatio");
        float parseFloat3 = TextUtils.isEmpty(str) ? 0.0f : Float.parseFloat(str);
        if (w2.p.j(3)) {
            StringBuilder sb = new StringBuilder(String.valueOf(parseFloat2).length() + 45 + String.valueOf(parseFloat).length() + 13 + String.valueOf(equals).length() + 19 + String.valueOf(parseInt).length() + 17 + String.valueOf(str).length());
            sb.append("Video Meta GMSG: currentTime : ");
            sb.append(parseFloat2);
            sb.append(" , duration : ");
            sb.append(parseFloat);
            sb.append(" , isMuted : ");
            sb.append(equals);
            sb.append(" , playbackState : ");
            sb.append(parseInt);
            sb.append(" , aspectRatio : ");
            sb.append(str);
            w2.p.a(sb.toString());
        }
        g8.m8(parseFloat2, parseFloat, parseInt, equals, parseFloat3);
    }
}
