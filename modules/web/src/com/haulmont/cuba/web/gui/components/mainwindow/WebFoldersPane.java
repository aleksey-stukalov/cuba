/*
 * Copyright (c) 2008-2016 Haulmont.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.haulmont.cuba.web.gui.components.mainwindow;

import com.haulmont.cuba.gui.components.mainwindow.FoldersPane;
import com.haulmont.cuba.web.app.folders.CubaFoldersPane;
import com.haulmont.cuba.web.gui.components.WebAbstractComponent;
import org.apache.commons.lang.StringUtils;

public class WebFoldersPane extends WebAbstractComponent<CubaFoldersPane> implements FoldersPane {

    protected String styleName;

    public WebFoldersPane() {
        component = createComponent();
    }

    protected CubaFoldersPane createComponent() {
        return new CubaFoldersPane();
    }

    @Override
    public void setStyleName(String styleName) {
        if (StringUtils.isNotEmpty(this.styleName)) {
            getComposition().removeStyleName(this.styleName);
        }

        this.styleName = styleName;

        if (StringUtils.isNotEmpty(styleName)) {
            getComposition().addStyleName(styleName);
        }
    }

    @Override
    public void loadFolders() {
        component.loadFolders();
    }
}