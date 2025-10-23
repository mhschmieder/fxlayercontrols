/**
 * MIT License
 *
 * Copyright (c) 2020, 2023 Mark Schmieder
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 * This file is part of the FxLayerGui Library
 *
 * You should have received a copy of the MIT License along with the
 * FxLayerGui Library. If not, see <https://opensource.org/licenses/MIT>.
 *
 * Project: https://github.com/mhschmieder/fxlayergui
 */
package com.mhschmieder.fxlayercontrols;

public class LayerManagementMessageFactory {

    // NOTE: The constructor is disabled, as this is a static class.
    private LayerManagementMessageFactory() {}

    public static final String getDeleteLayersMasthead() {
        return "Confirm Delete Layers"; //$NON-NLS-1$
    }

    public static final String getDeleteLayersMessage() {
        return "Are you sure you want to delete the selected layers?"; //$NON-NLS-1$
    }

    public static final String getDeleteLayersTitle() {
        return "Delete Layers"; //$NON-NLS-1$
    }
}
