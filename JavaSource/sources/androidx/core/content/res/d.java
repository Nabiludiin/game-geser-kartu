package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: MyApplication */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final Shader f1656a;

    /* renamed from: b, reason: collision with root package name */
    private final ColorStateList f1657b;

    /* renamed from: c, reason: collision with root package name */
    private int f1658c;

    private d(Shader shader, ColorStateList colorStateList, int i7) {
        this.f1656a = shader;
        this.f1657b = colorStateList;
        this.f1658c = i7;
    }

    private static d a(Resources resources, int i7, Resources.Theme theme) {
        int next;
        XmlResourceParser xml = resources.getXml(i7);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        if (name.equals("gradient")) {
            return d(f.b(resources, xml, asAttributeSet, theme));
        }
        if (name.equals("selector")) {
            return c(c.b(resources, xml, asAttributeSet, theme));
        }
        throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
    }

    static d b(int i7) {
        return new d(null, null, i7);
    }

    static d c(ColorStateList colorStateList) {
        return new d(null, colorStateList, colorStateList.getDefaultColor());
    }

    static d d(Shader shader) {
        return new d(shader, null, 0);
    }

    public static d g(Resources resources, int i7, Resources.Theme theme) {
        try {
            return a(resources, i7, theme);
        } catch (Exception e8) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e8);
            return null;
        }
    }

    public int e() {
        return this.f1658c;
    }

    public Shader f() {
        return this.f1656a;
    }

    public boolean h() {
        return this.f1656a != null;
    }

    public boolean i() {
        ColorStateList colorStateList;
        return this.f1656a == null && (colorStateList = this.f1657b) != null && colorStateList.isStateful();
    }

    public boolean j(int[] iArr) {
        if (!i()) {
            return false;
        }
        ColorStateList colorStateList = this.f1657b;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (colorForState == this.f1658c) {
            return false;
        }
        this.f1658c = colorForState;
        return true;
    }

    public void k(int i7) {
        this.f1658c = i7;
    }

    public boolean l() {
        return h() || this.f1658c != 0;
    }
}
