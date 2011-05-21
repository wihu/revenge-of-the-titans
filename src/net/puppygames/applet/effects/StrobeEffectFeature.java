/*
 * Copyright (c) 2003 Shaven Puppy Ltd
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 *
 * * Redistributions of source code must retain the above copyright
 *   notice, this list of conditions and the following disclaimer.
 *
 * * Redistributions in binary form must reproduce the above copyright
 *   notice, this list of conditions and the following disclaimer in the
 *   documentation and/or other materials provided with the distribution.
 *
 * * Neither the name of 'Shaven Puppy' nor the names of its contributors
 *   may be used to endorse or promote products derived from this software
 *   without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED
 * TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.puppygames.applet.effects;


import org.lwjgl.util.Color;

import com.shavenpuppy.jglib.resources.ColorSequenceResource;
import com.shavenpuppy.jglib.sprites.SpriteAllocator;

/**
 * $Id: StrobeEffectFeature.java,v 1.3 2010/02/06 01:26:34 foo Exp $
 *
 * @author $Author: foo $
 * @version $Revision: 1.3 $
 */
public class StrobeEffectFeature extends EffectFeature {

	private static final long serialVersionUID = 1L;

	/*
	 * Resource data
	 */

	private Color color;
	private int duration;

	// or...

	private ColorSequenceResource sequence;

	/**
	 * C'tor
	 */
	public StrobeEffectFeature() {
		super();
	}

	/**
	 * @param name
	 */
	public StrobeEffectFeature(String name) {
		super(name);
	}

	/* (non-Javadoc)
	 * @see net.puppygames.applet.effects.EffectFeature#doSpawn(net.puppygames.applet.Screen)
	 */
	@Override
	protected Effect doSpawn(SpriteAllocator screen) {
		if (sequence == null) {
			return new StrobeEffect(color, duration);
		} else {
			return new StrobeEffect(sequence);
		}
	}

}
