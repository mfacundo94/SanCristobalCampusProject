package md53ce643dd8eccd9a8e37e894e8722ff9d;


public class ArtinaDatePickerRenderer
	extends md5b60ffeb829f638581ab2bb9b1a7f4f3f.DatePickerRenderer
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onSizeChanged:(IIII)V:GetOnSizeChanged_IIIIHandler\n" +
			"";
		mono.android.Runtime.register ("UXDivers.Artina.Shared.ArtinaDatePickerRenderer, UXDivers.Artina.Shared.Droid, Version=2.6.9.0, Culture=neutral, PublicKeyToken=null", ArtinaDatePickerRenderer.class, __md_methods);
	}


	public ArtinaDatePickerRenderer (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == ArtinaDatePickerRenderer.class)
			mono.android.TypeManager.Activate ("UXDivers.Artina.Shared.ArtinaDatePickerRenderer, UXDivers.Artina.Shared.Droid, Version=2.6.9.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public ArtinaDatePickerRenderer (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == ArtinaDatePickerRenderer.class)
			mono.android.TypeManager.Activate ("UXDivers.Artina.Shared.ArtinaDatePickerRenderer, UXDivers.Artina.Shared.Droid, Version=2.6.9.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0, p1 });
	}


	public ArtinaDatePickerRenderer (android.content.Context p0)
	{
		super (p0);
		if (getClass () == ArtinaDatePickerRenderer.class)
			mono.android.TypeManager.Activate ("UXDivers.Artina.Shared.ArtinaDatePickerRenderer, UXDivers.Artina.Shared.Droid, Version=2.6.9.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0 });
	}


	public void onSizeChanged (int p0, int p1, int p2, int p3)
	{
		n_onSizeChanged (p0, p1, p2, p3);
	}

	private native void n_onSizeChanged (int p0, int p1, int p2, int p3);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
