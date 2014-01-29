/**
 * Copyright 2012-2014 Johns Hopkins University HLTCOE. All rights reserved.
 * This software is released under the 2-clause BSD license.
 * See LICENSE in the project root directory.
 */
package edu.jhu.hlt.concrete.examples;

import edu.jhu.hlt.concrete.Communication;
import edu.jhu.hlt.concrete.SentenceSegmentationCollection;

/**
 * @author max
 *
 */
public interface SentenceSegmenter {
  public SentenceSegmentationCollection generateSentenceSegmentations(Communication c) throws AnnotationException;
}