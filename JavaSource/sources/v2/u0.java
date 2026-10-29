package v2;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.gms.internal.ads.c03;
import com.google.android.gms.internal.ads.ex3;
import com.google.android.gms.internal.ads.gy3;
import com.google.android.gms.internal.ads.uy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MyApplication */
public abstract class u0 {
    public static boolean a(int i7) {
        if (((Boolean) s2.b0.c().d(uy.Y3)).booleanValue()) {
            return ((Boolean) s2.b0.c().d(uy.Z3)).booleanValue() || i7 <= 15299999;
        }
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:3|4|5|(5:8|9|10|11|6)|55|56|(1:58)(1:61)|59|14|(11:47|48|17|18|19|(2:21|(6:25|26|27|(2:36|37)|29|(2:31|32)))(2:41|(6:43|44|27|(0)|29|(0)))|40|27|(0)|29|(0))|16|17|18|19|(0)(0)|40|27|(0)|29|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x014e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0162, code lost:
    
        r2 = v2.n1.f26802b;
        w2.p.d("Could not log native template signal to JSON", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x017b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0110 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.json.JSONObject b(android.content.Context r17, android.view.View r18) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v2.u0.b(android.content.Context, android.view.View):org.json.JSONObject");
    }

    public static JSONObject c(View view) {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                if (((Boolean) s2.b0.c().d(uy.M8)).booleanValue()) {
                    r2.t.g();
                    ViewParent parent = view.getParent();
                    while (parent != null && !(parent instanceof ScrollView)) {
                        parent = parent.getParent();
                    }
                    jSONObject.put("contained_in_scroll_view", parent != null);
                    return jSONObject;
                }
                r2.t.g();
                ViewParent parent2 = view.getParent();
                while (parent2 != null && !(parent2 instanceof AdapterView)) {
                    parent2 = parent2.getParent();
                }
                if ((parent2 == null ? -1 : ((AdapterView) parent2).getPositionForView(view)) == -1) {
                    r2 = false;
                }
                jSONObject.put("contained_in_scroll_view", r2);
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    public static JSONObject d(Context context, View view) {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                r2.t.g();
                jSONObject.put("can_show_on_lock_screen", f2.c0(view));
                r2.t.g();
                jSONObject.put("is_keyguard_locked", f2.h(context));
                return jSONObject;
            } catch (JSONException unused) {
                int i7 = n1.f26802b;
                w2.p.f("Unable to get lock screen information");
            }
        }
        return jSONObject;
    }

    public static JSONObject e(Context context, Map map, Map map2, View view, ImageView.ScaleType scaleType) {
        String str;
        String str2;
        Iterator it;
        JSONObject jSONObject;
        String str3 = "ad_view";
        String str4 = "relative_to";
        JSONObject jSONObject2 = new JSONObject();
        if (map != null && view != null) {
            int[] g8 = g(view);
            Iterator it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                View view2 = (View) ((WeakReference) entry.getValue()).get();
                if (view2 != null) {
                    int[] g9 = g(view2);
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = new JSONObject();
                    int[] iArr = g8;
                    try {
                        it = it2;
                        try {
                            jSONObject4.put("width", s2.z.a().j(context, view2.getMeasuredWidth()));
                            jSONObject4.put("height", s2.z.a().j(context, view2.getMeasuredHeight()));
                            jSONObject4.put("x", s2.z.a().j(context, g9[0] - iArr[0]));
                            jSONObject4.put("y", s2.z.a().j(context, g9[1] - iArr[1]));
                            jSONObject4.put(str4, str3);
                            jSONObject3.put("frame", jSONObject4);
                            Rect rect = new Rect();
                            if (view2.getLocalVisibleRect(rect)) {
                                jSONObject = l(context, rect);
                            } else {
                                jSONObject = new JSONObject();
                                jSONObject.put("width", 0);
                                jSONObject.put("height", 0);
                                jSONObject.put("x", s2.z.a().j(context, g9[0] - iArr[0]));
                                jSONObject.put("y", s2.z.a().j(context, g9[1] - iArr[1]));
                                jSONObject.put(str4, str3);
                            }
                            jSONObject3.put("visible_bounds", jSONObject);
                            if (((String) entry.getKey()).equals("3010")) {
                                if (((Boolean) s2.b0.c().d(uy.N8)).booleanValue()) {
                                    jSONObject3.put("mediaview_graphics_matrix", view2.getMatrix().toShortString());
                                }
                                if (((Boolean) s2.b0.c().d(uy.O8)).booleanValue()) {
                                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                                    jSONObject3.put("view_width_layout_type", m(layoutParams.width) - 1);
                                    jSONObject3.put("view_height_layout_type", m(layoutParams.height) - 1);
                                }
                                if (((Boolean) s2.b0.c().d(uy.P8)).booleanValue()) {
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(Integer.valueOf(view2.getId()));
                                    for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                        arrayList.add(Integer.valueOf(((View) parent).getId()));
                                    }
                                    jSONObject3.put("view_path", TextUtils.join("/", arrayList));
                                }
                                if (scaleType != null) {
                                    jSONObject3.put("mediaview_scale_type", scaleType.ordinal());
                                }
                            }
                            if (view2 instanceof TextView) {
                                TextView textView = (TextView) view2;
                                jSONObject3.put("text_color", textView.getCurrentTextColor());
                                str = str3;
                                str2 = str4;
                                try {
                                    jSONObject3.put("font_size", textView.getTextSize());
                                    jSONObject3.put("text", textView.getText());
                                } catch (JSONException unused) {
                                    int i7 = n1.f26802b;
                                    w2.p.f("Unable to get asset views information");
                                    it2 = it;
                                    g8 = iArr;
                                    str3 = str;
                                    str4 = str2;
                                }
                            } else {
                                str = str3;
                                str2 = str4;
                            }
                            jSONObject3.put("is_clickable", map2 != null && map2.containsKey(entry.getKey()) && view2.isClickable());
                            if (((Boolean) s2.b0.c().d(uy.Q8)).booleanValue()) {
                                jSONObject3.put("alpha", view2.getAlpha());
                            }
                            jSONObject2.put((String) entry.getKey(), jSONObject3);
                        } catch (JSONException unused2) {
                            str = str3;
                            str2 = str4;
                        }
                    } catch (JSONException unused3) {
                        str = str3;
                        str2 = str4;
                        it = it2;
                    }
                    it2 = it;
                    g8 = iArr;
                    str3 = str;
                    str4 = str2;
                }
            }
        }
        return jSONObject2;
    }

    public static JSONObject f(String str, Context context, Point point, Point point2) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = null;
        try {
            jSONObject = new JSONObject();
        } catch (Exception e8) {
            e = e8;
        }
        try {
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("x", s2.z.a().j(context, point2.x));
                jSONObject3.put("y", s2.z.a().j(context, point2.y));
                jSONObject3.put("start_x", s2.z.a().j(context, point.x));
                jSONObject3.put("start_y", s2.z.a().j(context, point.y));
                jSONObject2 = jSONObject3;
            } catch (JSONException e9) {
                int i7 = n1.f26802b;
                w2.p.d("Error occurred while putting signals into JSON object.", e9);
            }
            jSONObject.put("click_point", jSONObject2);
            jSONObject.put("asset_id", str);
            return jSONObject;
        } catch (Exception e10) {
            e = e10;
            jSONObject2 = jSONObject;
            int i8 = n1.f26802b;
            w2.p.d("Error occurred while grabbing click signals.", e);
            return jSONObject2;
        }
    }

    public static int[] g(View view) {
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        return iArr;
    }

    public static Point h(MotionEvent motionEvent, View view) {
        int[] g8 = g(view);
        return new Point(((int) motionEvent.getRawX()) - g8[0], ((int) motionEvent.getRawY()) - g8[1]);
    }

    public static boolean i(Context context, c03 c03Var) {
        if (!c03Var.N) {
            return false;
        }
        if (((Boolean) s2.b0.c().d(uy.R8)).booleanValue()) {
            return ((Boolean) s2.b0.c().d(uy.V8)).booleanValue();
        }
        String str = (String) s2.b0.c().d(uy.S8);
        if (!str.isEmpty() && context != null) {
            String packageName = context.getPackageName();
            Iterator it = gy3.a(ex3.b(';')).d(str).iterator();
            while (it.hasNext()) {
                if (((String) it.next()).equals(packageName)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static JSONObject j(Context context) {
        JSONObject jSONObject = new JSONObject();
        r2.t.g();
        DisplayMetrics j02 = f2.j0((WindowManager) context.getSystemService("window"));
        try {
            jSONObject.put("width", s2.z.a().j(context, j02.widthPixels));
            jSONObject.put("height", s2.z.a().j(context, j02.heightPixels));
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public static WindowManager.LayoutParams k() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 0, 0, -2);
        layoutParams.flags = ((Integer) s2.b0.c().d(uy.U8)).intValue();
        layoutParams.type = 2;
        layoutParams.gravity = 8388659;
        return layoutParams;
    }

    private static JSONObject l(Context context, Rect rect) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", s2.z.a().j(context, rect.right - rect.left));
        jSONObject.put("height", s2.z.a().j(context, rect.bottom - rect.top));
        jSONObject.put("x", s2.z.a().j(context, rect.left));
        jSONObject.put("y", s2.z.a().j(context, rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }

    private static int m(int i7) {
        if (i7 != -2) {
            return i7 != -1 ? 2 : 3;
        }
        return 4;
    }
}
