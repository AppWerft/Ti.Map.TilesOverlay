package ti.map.tileoverlay;

import org.appcelerator.kroll.KrollDict;
import org.appcelerator.titanium.TiC;

public class UrlSchema {
	private String url = "";
	private double opacity = 1.0f;

	public UrlSchema(KrollDict opts) {
		if (opts.containsKeyAndNotNull(TiC.PROPERTY_OPACITY)) {
			this.opacity = opts.getDouble(TiC.PROPERTY_OPACITY);
		}
		if (opts.containsKeyAndNotNull("xyz")) {
			buildXyzUrl(opts.getKrollDict("xyz"));
		}
		if (opts.containsKeyAndNotNull("wmts")) {
			buildWmtsUrl(opts.getKrollDict("wmts"));
		}
		if (opts.containsKeyAndNotNull("wms")) {
			buildWmsUrl(opts.getKrollDict("wms"));
		}
	}

	private void buildXyzUrl(KrollDict opts) {
		this.url = opts.getString(TiC.PROPERTY_URL);

	}

	private void buildWmtsUrl(KrollDict opts) {
		this.url = opts.getString(TiC.PROPERTY_URL);

	}

	private void buildWmsUrl(KrollDict opts) {
		this.url = opts.getString(TiC.PROPERTY_URL);

	}

}
