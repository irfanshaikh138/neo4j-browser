import React from 'react'
import {
  DrawerSubHeader,
  DrawerSection,
  DrawerSectionBody
} from 'browser-components/drawer'

export const NodeLabel = ({ nodeLabel = '' }) => {
  return nodeLabel ? (
    <DrawerSection>
      <DrawerSubHeader>Node Label</DrawerSubHeader>
      <DrawerSectionBody>{nodeLabel}</DrawerSectionBody>
    </DrawerSection>
  ) : (
    ''
  )
}
