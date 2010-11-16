/*
 * Copyright (C) 2010 Geometer Plus <contact@geometerplus.com>
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
 * 02110-1301, USA.
 */

package org.geometerplus.fbreader.network;

import java.util.Set;

import org.geometerplus.zlibrary.core.network.ZLNetworkRequest;

import org.geometerplus.fbreader.network.authentication.NetworkAuthenticationManager;


public interface INetworkLink {

	String URL_MAIN = "main";
	String URL_SEARCH = "search";
	String URL_SIGN_IN = "signIn";
	String URL_SIGN_OUT = "signOut";
	String URL_SIGN_UP = "signUp";
	String URL_REFILL_ACCOUNT = "refillAccount";
	String URL_RECOVER_PASSWORD = "recoverPassword";

	String getSiteName();
	String getTitle();
	String getSummary();
	String getIcon();
	String getLink(String urlKey);
	String getLanguage();

	Set<String> getLinkKeys();

	NetworkOperationData createOperationData(INetworkLink link,
			NetworkOperationData.OnNewItemListener listener);

	ZLNetworkRequest simpleSearchRequest(String pattern, NetworkOperationData data);
	ZLNetworkRequest resume(NetworkOperationData data);

	NetworkLibraryItem libraryItem();
	NetworkAuthenticationManager authenticationManager();

	String rewriteUrl(String url, boolean isUrlExternal);
}
