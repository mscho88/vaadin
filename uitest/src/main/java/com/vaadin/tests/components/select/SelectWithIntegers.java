/*
 * Copyright 2000-2016 Vaadin Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.vaadin.tests.components.select;

import java.util.Arrays;
import java.util.List;

import com.vaadin.server.VaadinRequest;
import com.vaadin.tests.components.AbstractTestUI;
import com.vaadin.v7.ui.AbstractSelect;
import com.vaadin.v7.ui.AbstractSelect.ItemCaptionMode;
import com.vaadin.v7.ui.ListSelect;

public class SelectWithIntegers extends AbstractTestUI {
    private final List<Integer> years = Arrays.asList(2014, 2015, 2016);

    @Override
    protected void setup(VaadinRequest request) {
        addComponent(createSelect("Default", null));
        addComponent(createSelect("ID_TOSTRING", ItemCaptionMode.ID_TOSTRING));
    }

    private AbstractSelect createSelect(String caption, ItemCaptionMode mode) {
        ListSelect listSelect = new ListSelect(caption, years);
        listSelect.setRows(years.size());
        listSelect.setNullSelectionAllowed(false);
        if (mode != null) {
            listSelect.setItemCaptionMode(mode);
        }
        return listSelect;
    }

}
